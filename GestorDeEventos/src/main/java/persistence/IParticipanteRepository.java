package main.java.persistence;

import java.util.List;
import main.java.application.dto.ParticipanteDTO;

public interface IParticipanteRepository {
    void guardarParticipantes(List<ParticipanteDTO> participantes);
    List<ParticipanteDTO> cargarParticipantes();
}
