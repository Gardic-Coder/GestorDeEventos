package main.java.application.services;

import java.util.ArrayList;
import java.util.List;
import main.java.application.dto.*;
import main.java.domain.*;
import main.java.persistence.*;


public class ParticipanteService {
    private final IEventoRepository eventoRepo = new EventoRepository();
    //private final IParticipanteRepository participanteRepo = new ParticipanteRepository();
    EventoService eventoService = new EventoService();
    
    public void agregarParticipante(ParticipanteDTO participanteDTO) {
       List<Evento> eventos = EventoMapper.listFromDTO(eventoRepo.cargarEventos());
       Participante nuevoParticipante = ParticipanteMapper.fromDTO(participanteDTO);
       
       eventos.stream().filter(evento -> (evento.getID().equals(participanteDTO.getEvento()))).forEachOrdered(evento -> {
           evento.agregarParticipante(nuevoParticipante);
        });
       
       List<EventoDTO> eventosDTO = EventoMapper.listToDTO(eventos);
       
       eventoService.guardarTodo(eventosDTO);
    }
    
    public void eliminarParticipante(ParticipanteDTO participante) {
       List<Evento> eventos = EventoMapper.listFromDTO(eventoRepo.cargarEventos());
       Participante participanteEliminar = ParticipanteMapper.fromDTO(participante);
       
       eventos.stream().filter(evento -> (evento.getID().equals(participanteEliminar.getEvento()))).forEachOrdered((Evento evento) -> {
           evento.eliminarParticipante(participanteEliminar);
        });
       
       List<EventoDTO> eventosDTO = EventoMapper.listToDTO(eventos);
       
       eventoService.guardarTodo(eventosDTO);
    }
}
