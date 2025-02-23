package main.java.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import main.java.application.dto.*;
import main.java.domain.*;
import main.java.persistence.*;

public class EventoService {
    private final IEventoRepository eventoRepo = new EventoRepository();
    private final IParticipanteRepository participanteRepo = new ParticipanteRepository();

    List<Evento> cargarTodosLosEventos() {
        List<Evento> eventos = EventoMapper.listFromDTO(eventoRepo.cargarEventos());
        List<Participante> participantes = ParticipanteMapper.listaFromDTO(participanteRepo.cargarParticipantes());

        // Agrupar participantes por ID de evento
        Map<String, List<Participante>> participantesPorEvento = participantes.stream()
            .collect(Collectors.groupingBy(Participante::getEvento));

        // Asignar participantes a cada evento
        eventos.forEach(evento -> {
            Set<Participante> participantesEvento = new TreeSet<>(
                participantesPorEvento.getOrDefault(evento.getID(), new ArrayList<>())
            );
            evento.setListaParticipantes(participantesEvento);
        });
        
        Evento.inicializarContador(eventos); // Inicializar contador

        return eventos;
    }

    void guardarTodo(List<EventoDTO> eventos) {
        // Extraer todos los participantes de todos los eventos
        List<ParticipanteDTO> participantes = eventos.stream()
            .flatMap(e -> e.getListaParticipantes().stream())
            .collect(Collectors.toList());

        eventoRepo.guardarEventos(eventos);
        participanteRepo.guardarParticipantes(participantes);
    }
    
    public void recibirEventoDTO(EventoDTO eventoDTO) {
        Evento nuevoEvento = EventoMapper.fromDTO(eventoDTO); // Conversion de DTO a Objeto de dominio.
        List<Evento> eventos = cargarTodosLosEventos(); // Se carga la lista de eventos.
        
        eventos.add(nuevoEvento); // Se agrega el nuevo evento a la lista de eventos.
        
        List<EventoDTO> eventosDTO = EventoMapper.listToDTO(eventos);
        
        guardarTodo(eventosDTO); // Se guarda la nueva lista.
    }
    
    public EventoDTO generarEventoID(EventoDTO eventoDTO) {
        Evento eventoNuevo = EventoMapper.fromDTO(eventoDTO);
        eventoDTO = EventoMapper.toDTO(eventoNuevo);
        
        return eventoDTO;
    }
    
    public List<EventoDTO> listaDeEventoDTO() {
        List<Evento> eventos = cargarTodosLosEventos(); // Se carga la lista de eventos.
        List<EventoDTO> eventosDTO = new ArrayList<>();
        
        eventos.forEach(evento -> {
            eventosDTO.add(EventoMapper.toDTO(evento)); // Se convierten todos los elementos de la lista.
        });
        
        return eventosDTO; // Se devuelve la lista en DTO.
    }
     
}
