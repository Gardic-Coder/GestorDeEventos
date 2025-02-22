package main.java.application.dto;

import java.util.ArrayList;
import java.util.List;
import main.java.domain.Participante;

public class ParticipanteMapper {
    // Convierte un Participante a ParticipanteDTO
    public static ParticipanteDTO toDTO(Participante participante) {
        return new ParticipanteDTO(
                participante.getNombre(),
                participante.getCedula(),
                participante.getCorreo(),
                participante.getTelefono(),
                participante.getRol(),
                participante.getEvento(),
                participante.isAsistencia(),
                participante.getTema(),
                participante.getDescripcion()
        );
    }

    // Convierte un ParticipanteDTO a Participante
    public static Participante fromDTO(ParticipanteDTO dto) {
        return new Participante(
                dto.getNombre(),
                dto.getCedula(),
                dto.getCorreo(),
                dto.getTelefono(),
                dto.getRol(),
                dto.getEvento(),
                dto.isAsistencia(),
                dto.getTema(),
                dto.getDescripcion()
        );
    }
    
    public static List<ParticipanteDTO> listaToDTO(List<Participante> participantes) {
        List<ParticipanteDTO> participantesDTO = new ArrayList<>();
        
        participantes.forEach(participante -> {
            participantesDTO.add(ParticipanteMapper.toDTO(participante));
        });
        
        return participantesDTO;
    }
    
    public static List<Participante> listaFromDTO(List<ParticipanteDTO> participantesDTO) {
        List<Participante> participantes = new ArrayList<>();
        
        participantesDTO.forEach(participanteDTO -> {
            participantes.add(ParticipanteMapper.fromDTO(participanteDTO));
        });
        
        return participantes;
    }
}
