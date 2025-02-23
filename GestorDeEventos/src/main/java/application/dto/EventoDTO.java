package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class EventoDTO {
    private String nombre;
    private TipoEvento tipo;
    private String lugar;
    private LocalDate fecha; //Date??
    private LocalTime horaComienzo; //Date??
    private LocalTime horaFinalizado;
    private final int CapMax;
    private String descripcion;
    private Set<ParticipanteDTO> listaParticipantes;
    private final String ID;

    // Constructor
    public EventoDTO(String nombre, TipoEvento tipo, String lugar, LocalDate fecha,
            LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, String descripcion, 
            Set<ParticipanteDTO> listaParticipantes, String ID){
        this.nombre = nombre;
        this.tipo = tipo;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.CapMax = CapMax;
        this.descripcion = descripcion;
        this.listaParticipantes = listaParticipantes;
        this.ID = ID;
    }
    
    public EventoDTO(String nombre, TipoEvento tipo, String lugar, LocalDate fecha,
            LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, String descripcion, 
            String ID){
        this.nombre = nombre;
        this.tipo = tipo;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.CapMax = CapMax;
        this.descripcion = descripcion;
        this.listaParticipantes = listaParticipantes;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<ParticipanteDTO> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(Set<ParticipanteDTO> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public int getCapMax() {
        return CapMax;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "EventoDTO{" + "nombre=" + nombre + ", tipo=" + tipo + ", lugar=" + lugar + ", fecha=" + fecha + ", horaComienzo=" + horaComienzo + ", horaFinalizado=" + horaFinalizado + ", CapMax=" + CapMax + ", descripcion=" + descripcion + ", listaParticipantes=" + listaParticipantes + ", ID=" + ID + '}';
    }
    
}
