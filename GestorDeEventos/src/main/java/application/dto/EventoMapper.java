package main.java.application.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import main.java.domain.*;

public class EventoMapper {
    // Convierte un Evento a EventoDTO
    public static EventoDTO toDTO(Evento evento) {
        Set<ParticipanteDTO> participantesDTO = evento.getListaParticipantes()
            .stream()
            .map(ParticipanteMapper::toDTO)
            .collect(Collectors.toSet());
        
        return new EventoDTO(
                evento.getNombre(), 
                evento.getTipo(), 
                evento.getLugar(), 
                evento.getFecha(), 
                evento.getHoraComienzo(), 
                evento.getHoraFinalizado(), 
                evento.getCapMax(), 
                evento.getDescripcion(), 
                participantesDTO, 
                evento.getID());
    }

    // Convierte un EventoDTO a Evento
    public static Evento fromDTO(EventoDTO dto) {
        
        
        if(dto.getID() == null) {
            return new Evento(
                    dto.getNombre(), 
                    dto.getTipo(), 
                    dto.getLugar(), 
                    dto.getFecha(), 
                    dto.getHoraComienzo(), 
                    dto.getHoraFinalizado(), 
                    dto.getCapMax(), 
                    dto.getDescripcion());
            
        } else {
            Set<Participante> participantes = dto.getListaParticipantes()
            .stream()
            .map(ParticipanteMapper::fromDTO)
            .collect(Collectors.toSet());
            return new Evento(
                dto.getNombre(), 
                dto.getTipo(), 
                dto.getLugar(), 
                dto.getFecha(), 
                dto.getHoraComienzo(), 
                dto.getHoraFinalizado(), 
                dto.getCapMax(), 
                dto.getDescripcion(), 
                participantes, 
                dto.getID());
        }
    }
    
    public static List<EventoDTO> listToDTO(List<Evento> eventos) {
        List<EventoDTO> eventosDTO = new ArrayList<>();
        
        eventos.forEach(evento -> {
            eventosDTO.add(EventoMapper.toDTO(evento)); // Se convierten todos los elementos de la lista.
        });
        
        return eventosDTO;
    }
    
    public static List<Evento> listFromDTO(List<EventoDTO> eventosDTO) {
        List<Evento> eventos = new ArrayList<>();
        
        eventosDTO.forEach(eventoDTO -> {
            eventos.add(EventoMapper.fromDTO(eventoDTO)); // Se convierten todos los elementos de la lista.
        });
        
        return eventos;
    }
}
