package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

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

    public Set<ParticipanteDTO> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(Set<ParticipanteDTO> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(LocalTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public LocalTime getHoraFinalizado() {
        return horaFinalizado;
    }

    public void setHoraFinalizado(LocalTime horaFinalizado) {
        this.horaFinalizado = horaFinalizado;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    @Override
    public String toString() {
        return "EventoDTO{" + "listaParticipantes=" + listaParticipantes + ", nombre=" + nombre + ", lugar=" + lugar + ", fecha=" + fecha + ", horaComienzo=" + horaComienzo + ", horaFinalizado=" + horaFinalizado + ", capMax=" + capMax + '}';
    }
    
}
