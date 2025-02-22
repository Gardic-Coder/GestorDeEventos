package main.java.persistence;

import java.util.List;

import main.java.application.dto.EventoDTO;

public interface IEventoRepository {
    public List<EventoDTO> cargarEventos();
    public void guardarEventos(List<EventoDTO> eventos);
}
