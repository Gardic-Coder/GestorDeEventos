package main.java.application.dto;

import main.java.domain.RolParticipante;

public class ParticipanteDTO {
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private RolParticipante rol;
    private String evento;
    private boolean asistencia;
    private String tema;
    private String descripcion;
    
     // Constructor
    public ParticipanteDTO(String nombre, String cedula, String correo, String telefono, 
                           RolParticipante rol, String evento, boolean asistencia, 
                           String tema, String descripcion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.rol = rol;
        this.evento = evento;
        this.asistencia = asistencia;
        this.tema = tema;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public RolParticipante getRol() {
        return rol;
    }

    public void setRol(RolParticipante rol) {
        this.rol = rol;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ParticipanteDTO{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + ", rol=" + rol + ", evento=" + evento + ", asistencia=" + asistencia + ", tema=" + tema + ", descripcion=" + descripcion + '}';
    }
    
}
