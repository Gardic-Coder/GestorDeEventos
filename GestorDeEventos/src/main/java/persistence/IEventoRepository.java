package main.java.persistence;

import java.util.List;

import main.java.domain.Evento;

public interface IEventoRepository {
    public List<Evento> cargarEventos();
    public void guardarEventos(List<Evento> eventos);
}
