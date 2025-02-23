package main.java.application.services;

import java.util.ArrayList;
import java.util.List;
import main.java.application.dto.*;
import main.java.domain.*;
import main.java.persistence.*;

public class ParticipanteService {

    private final IEventoRepository eventoRepo = new EventoRepository();
    private final IParticipanteRepository participanteRepo = new ParticipanteRepository();
    EventoService eventoService = new EventoService();

    public void agregarParticipante(ParticipanteDTO participanteDTO) {
        List<Evento> eventos = eventoService.cargarTodosLosEventos();
        //EventoMapper.listFromDTO(eventoRepo.cargarEventos());

        Participante nuevoParticipante = ParticipanteMapper.fromDTO(participanteDTO);

        eventos.stream().filter(evento -> (evento.getID().equals(participanteDTO.getEvento()))).forEachOrdered(evento -> {
            evento.agregarParticipante(nuevoParticipante);
        });

        List<EventoDTO> eventosDTO = EventoMapper.listToDTO(eventos);
        eventoService.guardarTodo(eventosDTO);

    }

    public void eliminarParticipante(ParticipanteDTO participanteDTO) {
        Participante participante = ParticipanteMapper.fromDTO(participanteDTO);

        if (participante.getRol() == main.java.application.dto.RolParticipante.MODERADOR) {
            // Eliminar el evento completo si es moderador
            eventoService.eliminarEvento(participante.getEvento());
        } else {
            // Eliminar solo el participante
            List<Evento> eventos = eventoService.cargarTodosLosEventos();

            for (Evento evento : eventos) {
                if (evento.getID().equals(participante.getEvento())) {
                    evento.eliminarParticipante(participante);
                    break;
                }
            }

            eventoService.guardarTodo(EventoMapper.listToDTO(eventos));
        }
    }

    public List<ParticipanteDTO> participantesDeEvento(String EventoID) {
        List<ParticipanteDTO> participantes = new ArrayList<>();

        for (ParticipanteDTO participante : participanteRepo.cargarParticipantes()) {
            if (participante.getEvento().equals(EventoID)) {
                participantes.add(participante);
            }
        }

        return participantes;
    }

    public List<ParticipanteDTO> listaParticipantes() {
        List<ParticipanteDTO> participantes = participanteRepo.cargarParticipantes();
        return participantes;
    }

    

    public ParticipanteDTO buscarParticipantePorCedulaYEvento(String cedula, String idEvento) {
        return participanteRepo.cargarParticipantes().stream()
                .filter(p -> p.getCedula().equals(cedula) && p.getEvento().equals(idEvento))
                .findFirst()
                .orElse(null);
    }

}
