/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas.dto;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import participantesHeredados.moderadores;//Persona encargada del evento
import participantesHeredados.Asistente;
import participantesHeredados.Conferencista;
import participantesHeredados.Ponentes;
import participantesHeredados.Instructores;


/**
 *
 * @author Alejandro
 */

//Clase Abstracta de los Eventos; plantilla general de la cual saldran cada tipo de Evento

public abstract class EventoDTO {
    public Set<Asistente> listAsistentes;
    public Set<Ponentes> listPonentes;
    public Set<Instructores> listInstructores ;
    public Set<Conferencista> listConferencistas;
    public String nombre;
    public String lugar;
    public LocalDate fecha; //Date??
    public LocalTime horaComienzo; //Date??
    public LocalTime horaFinalizado;
    public int CapMax;
    private moderadores organizador;

    public EventoDTO(Set<Asistente> listAsistentes, Set<Ponentes> listPonentes, Set<Instructores> listInstructores, Set<Conferencista> listConferencistas, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado,  int CapMax, moderadores organizador) {
        this.listAsistentes = listAsistentes;
        this.listPonentes = listPonentes;
        this.listInstructores = listInstructores;
        this.listConferencistas = listConferencistas;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaComienzo = horaComienzo;
        this.horaFinalizado = horaFinalizado;
        this.CapMax = CapMax;
        this.organizador = organizador;
    }

    public void setListAsistentes(Set<Asistente> listAsistentes) {
        this.listAsistentes = listAsistentes;
    }

    public void setListPonentes(Set<Ponentes> listPonentes) {
        this.listPonentes = listPonentes;
    }

    public void setListInstructores(Set<Instructores> listInstructores) {
        this.listInstructores = listInstructores;
    }

    public void setListConferencistas(Set<Conferencista> listConferencistas) {
        this.listConferencistas = listConferencistas;
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

    public void setOrganizador(moderadores organizador) {
        this.organizador = organizador;
    }

    public Set<Asistente> getListAsistentes() {
        return listAsistentes;
    }

    public Set<Ponentes> getListPonentes() {
        return listPonentes;
    }

    public Set<Instructores> getListInstructores() {
        return listInstructores;
    }

    public Set<Conferencista> getListConferencistas() {
        return listConferencistas;
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

    public moderadores getOrganizador() {
        return organizador;
    }
    
    
    
    

    
    
}
