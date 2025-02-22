package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Clase Abstracta de los Eventos; plantilla general de la cual saldran cada tipo de Evento
public class Evento {
    private String nombre;
    private TipoEvento tipo;
    private String lugar;
    private LocalDate fecha; //Date??
    private LocalTime horaComienzo; //Date??
    private LocalTime horaFinalizado;
    private final int CapMax;
    private String descripcion;
    private Set<Participante> listaParticipantes;
    private final String ID;
    
    private static int contador = 0;
    
    public Evento(String nombre, TipoEvento tipo, String lugar, LocalDate fecha,
            LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, String descripcion, 
            Set<Participante> listaParticipantes){
        this.listaParticipantes = new TreeSet<>(new ParticipanteRolComparator());
        this.nombre = nombre;
        this.tipo = tipo;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.CapMax = CapMax;
        this.descripcion = descripcion;
        this.listaParticipantes = listaParticipantes;
        this.ID = crearID();
    }
    
    public Evento(String nombre, TipoEvento tipo, String lugar, LocalDate fecha,
            LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, String descripcion, 
            Set<Participante> listaParticipantes, String ID){
        this.listaParticipantes = new TreeSet<>(new ParticipanteRolComparator());
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
    
    public static void inicializarContador(List<Evento> eventos) {
        int maxId = eventos.stream()
            .map(e -> e.getID().replace("EVT-", ""))
            .mapToInt(Integer::parseInt)
            .max()
            .orElse(0);
        contador = maxId;
    }
    
    private String crearID() {
        return "EVT-" + (++contador);
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

    public int getCapMax() {
        return CapMax;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(Set<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", tipo=" + tipo + ", lugar=" + lugar + ", fecha=" + fecha + ", horaComienzo=" + horaComienzo + ", horaFinalizado=" + horaFinalizado + ", CapMax=" + CapMax + ", descripcion=" + descripcion + ", listaParticipantes=" + listaParticipantes + '}';
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
