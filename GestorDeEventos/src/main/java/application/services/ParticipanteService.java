package main.java.application.services;

import java.util.ArrayList;
import java.util.List;
import main.java.application.dto.*;
import main.java.domain.*;


public class ParticipanteService {
    EventoService eventoService = new EventoService();
    
    public void agregarParticipante(ParticipanteDTO participante) {
       List<EventoDTO> eventosDTO = eventoService.listaDeEventoDTO();
       List<Evento> eventos = new ArrayList<>();
       Participante nuevoParticipante = ParticipanteMapper.fromDTO(participante);
       
       eventosDTO.forEach(eventoDTO -> {
           eventos.add(EventoMapper.fromDTO(eventoDTO));
        });
       
       eventos.stream().filter(evento -> (evento.getID().equals(participante.getEvento()))).forEachOrdered(evento -> {
           evento.agregarParticipante(nuevoParticipante);
        });
       
       eventoService.guardarTodo(eventos);
    }
    
    public void eliminarParticipante(ParticipanteDTO participante) {
       List<EventoDTO> eventosDTO = eventoService.listaDeEventoDTO();
       List<Evento> eventos = new ArrayList<>();
       Participante participanteEliminar = ParticipanteMapper.fromDTO(participante);
       
       eventosDTO.forEach(eventoDTO -> {
           eventos.add(EventoMapper.fromDTO(eventoDTO));
        });
       
       eventos.stream().filter(evento -> (evento.getID().equals(participanteEliminar.getEvento()))).forEachOrdered((Evento evento) -> {
           evento.eliminarParticipante(participanteEliminar);
        });
       
       eventoService.guardarTodo(eventos);
    }
}
