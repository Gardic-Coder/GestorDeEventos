package main.java.persistence;

import java.util.List;

import main.java.domain.Participante;

public interface IParticipanteRepository {
    void guardarParticipantes(List<Participante> participantes);
    List<Participante> cargarParticipantes();
}
