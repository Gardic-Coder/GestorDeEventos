package main.java.application.dto;

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

        if (evento instanceof Conferencia conferencia) {
            return new ConferenciaDTO(
                participantesDTO,
                conferencia.getNombre(),
                conferencia.getLugar(),
                conferencia.getFecha(),
                conferencia.getHoraComienzo(),
                conferencia.getHoraFinalizado(),
                conferencia.getCapMax(),
                conferencia.getTemaPrincipal()
            );
        } else if (evento instanceof Seminario seminario) {
            return new SeminarioDTO(
                participantesDTO,
                seminario.getNombre(),
                seminario.getLugar(),
                seminario.getFecha(),
                seminario.getHoraComienzo(),
                seminario.getHoraFinalizado(),
                seminario.getCapMax(),
                seminario.getCantSesiones(),
                seminario.isGratuito(),
                seminario.isWorkShops()
            );
        } else if (evento instanceof Taller taller) {
            return new TallerDTO(
                participantesDTO,
                taller.getNombre(),
                taller.getLugar(),
                taller.getFecha(),
                taller.getHoraComienzo(),
                taller.getHoraFinalizado(),
                taller.getCapMax(),
                taller.getNivelDificultad(),
                taller.isEsPractico()
            );
        } else if (evento instanceof investigacionJor investigacionJor) {
            return new InvestigacionJorDTO(
                participantesDTO,
                investigacionJor.getNombre(),
                investigacionJor.getLugar(),
                investigacionJor.getFecha(),
                investigacionJor.getHoraComienzo(),
                investigacionJor.getHoraFinalizado(),
                investigacionJor.getCapMax(),
                investigacionJor.getInstitucionOrganizadora(),
                investigacionJor.getAreatematica()
            );
        } else {
            throw new IllegalArgumentException("Tipo de evento no soportado");
        }
    }

    // Convierte un EventoDTO a Evento
    public static Evento fromDTO(EventoDTO dto) {
        Set<Participante> participantes = dto.getListaParticipantes()
            .stream()
            .map(ParticipanteMapper::fromDTO)
            .collect(Collectors.toSet());

        if (dto instanceof ConferenciaDTO conferenciaDTO) {
            return new Conferencia(
                participantes,
                conferenciaDTO.getTemaPrincipal(),
                conferenciaDTO.getNombre(),
                conferenciaDTO.getLugar(),
                conferenciaDTO.getFecha(),
                conferenciaDTO.getHoraComienzo(),
                conferenciaDTO.getHoraFinalizado(),
                conferenciaDTO.getCapMax()
            );
        } else if (dto instanceof SeminarioDTO seminarioDTO) {
            return new Seminario(
                participantes,
                seminarioDTO.getCantSesiones(),
                seminarioDTO.isGratuito(),
                seminarioDTO.isWorkShops(),
                seminarioDTO.getNombre(),
                seminarioDTO.getLugar(),
                seminarioDTO.getFecha(),
                seminarioDTO.getHoraComienzo(),
                seminarioDTO.getHoraFinalizado(),
                seminarioDTO.getCapMax()
            );
        } else if (dto instanceof TallerDTO tallerDTO) {
            return new Taller(
                participantes,
                tallerDTO.getNivelDificultad(),
                tallerDTO.isEsPractico(),
                tallerDTO.getNombre(),
                tallerDTO.getLugar(),
                tallerDTO.getFecha(),
                tallerDTO.getHoraComienzo(),
                tallerDTO.getHoraFinalizado(),
                tallerDTO.getCapMax()
            );
        } else if (dto instanceof InvestigacionJorDTO investigacionJorDTO) {
            return new investigacionJor(
                participantes,
                investigacionJorDTO.getInstitucionOrganizadora(),
                investigacionJorDTO.getAreaTematica(),
                investigacionJorDTO.getNombre(),
                investigacionJorDTO.getLugar(),
                investigacionJorDTO.getFecha(),
                investigacionJorDTO.getHoraComienzo(),
                investigacionJorDTO.getHoraFinalizado(),
                investigacionJorDTO.getCapMax()
            );
        } else {
            throw new IllegalArgumentException("Tipo de DTO no soportado");
        }
    }
}
