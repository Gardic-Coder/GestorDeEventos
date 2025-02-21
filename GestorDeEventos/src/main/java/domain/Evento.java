package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import java.util.TreeSet;

//Clase Abstracta de los Eventos; plantilla general de la cual saldran cada tipo de Evento
public abstract class Evento {
    protected Set<Participante> listaParticipantes;
    protected String nombre;
    protected String lugar;
    protected LocalDate fecha; //Date??
    protected LocalTime horaComienzo; //Date??
    protected LocalTime horaFinalizado;
    protected int CapMax;
    
    public Evento(String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, 
                  LocalTime horaFinalizado, int CapMax) {
        this.listaParticipantes = new TreeSet<>(new ParticipanteRolComparator()); // Usa TreeSet con Comparator
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.CapMax = CapMax;
    }

    public Set<Participante> getListaParticipantes() {
        return listaParticipantes;
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

    public LocalTime getHoraComienzo() {
        return horaComienzo;
    }

    public LocalTime getHoraFinalizado() {
        return horaFinalizado;
    }

    public int getCapMax() {
        return CapMax;
    }

    public void setListaParticipantes(Set<Participante> listaParticipantes) {
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

    public void setHoraComienzo(LocalTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public void setHoraFinalizado(LocalTime horaFinalizado) {
        this.horaFinalizado = horaFinalizado;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    @Override
    public String toString() {
        return "Evento{" + "listaParticipantes=" + listaParticipantes + ", nombre=" + nombre + ", lugar=" + lugar + ", fecha=" + fecha + ", horaComienzo=" + horaComienzo + ", horaFinalizado=" + horaFinalizado + ", CapMax=" + CapMax + '}';
    }

    public void agregarParticipante(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException("El participante no puede ser nulo.");
        }
        if (listaParticipantes.size() >= CapMax) {
            throw new IllegalStateException("No se pueden agregar más participantes. Capacidad máxima alcanzada.");
        }
        listaParticipantes.add(participante);
    }

    public void eliminarParticipante(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException("El participante no puede ser nulo.");
        }
        listaParticipantes.remove(participante);
    }

    public boolean contieneParticipante(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException("El participante no puede ser nulo.");
        }
        return listaParticipantes.contains(participante);
    }
    
    public Participante buscarParticipante(String cedula) {
        for(Participante participante : listaParticipantes) {
            if(participante.getCedula().equals(cedula)) {
                return participante;
            }
        }
        return null;
    }
}
