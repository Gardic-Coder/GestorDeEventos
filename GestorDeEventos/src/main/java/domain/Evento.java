package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

//Clase Abstracta de los Eventos; plantilla general de la cual saldran cada tipo de Evento

public abstract class Evento {
    protected Set<Participante> listaParticipantes;
    protected String nombre;
    protected String lugar;
    protected LocalDate fecha; //Date??
    protected LocalTime horaComienzo; //Date??
    protected LocalTime horaFinalizado;
    protected int CapMax;

    public Evento(Set<Participante> listaParticipantes, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado,  int CapMax) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.CapMax = CapMax;
        this.listaParticipantes = listaParticipantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Set<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(Set<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public LocalTime getHoraComienzo() {
        return horaComienzo;
    }

    public LocalTime getHoraFinalizado() {
        return horaFinalizado;
    }

    public void setHoraComienzo(LocalTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public void setHoraFinalizado(LocalTime horaFinalizado) {
        this.horaFinalizado = horaFinalizado;
    }


    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }


    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }


    public int getCapMax() {
        return CapMax;
    }

    @Override
    public String toString() {
        return "Evento{" + "listaParticipantes=" + listaParticipantes + ", nombre=" + nombre + ", lugar=" + lugar + ", fecha=" + fecha + ", horaComienzo=" + horaComienzo + ", horaFinalizado=" + horaFinalizado + ", CapMax=" + CapMax + '}';
    } 
}
