/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas.dto;

/**
 *
 * @author Alejandro
 */

//Clase Abstracta de los Participantes; plantilla general de la cual saldran cada tipo de participante

public abstract class ParticipanteDTO { 
    public String nombre;
    public String cedula;
    public String correo;
    public String telefono;
    public String rol;
    public String Evento;
    public boolean asistencia;

    public ParticipanteDTO(String nombre, String cedula, String correo, String telefono, String rol, String Evento, boolean asistencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.rol = rol;
        this.Evento = Evento;
        this.asistencia = asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRol() {
        return rol;
    }

    public String getEvento() {
        return Evento;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEvento(String Evento) {
        this.Evento = Evento;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    } 
}
