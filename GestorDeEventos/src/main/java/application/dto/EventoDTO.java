package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import lombok.Data;

@Data
public abstract class EventoDTO {
    protected Set<ParticipanteDTO> listaParticipantes;
    protected String nombre;
    protected String lugar;
    protected LocalDate fecha;
    protected LocalTime horaComienzo;
    protected LocalTime horaFinalizado;
    protected int capMax;

    // Constructor
    public EventoDTO(Set<ParticipanteDTO> listaParticipantes, String nombre, String lugar, LocalDate fecha, 
                     LocalTime horaComienzo, LocalTime horaFinalizado, int capMax) {
        this.listaParticipantes = listaParticipantes;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.capMax = capMax;
    }
}
