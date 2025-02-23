package main.java.domain;

//Clase de los Participantes



public class Participante { 
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private RolParticipante rol;
    private String Evento;
    private boolean asistencia;
    private String tema;
    private String descripcion;
    
    public Participante(String nombre, String cedula, String correo, String telefono, 
            RolParticipante rol, String Evento, boolean asistencia, String tema, String descripcion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.Evento = Evento;
        this.asistencia = asistencia;
        this.rol = rol;
        this.descripcion = descripcion;
        this.tema = tema;
    }
    
    public Participante(String nombre, String cedula, String correo, String telefono, 
            RolParticipante rol, String Evento, boolean asistencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.Evento = Evento;
        this.asistencia = asistencia;
        this.rol = rol;
        this.descripcion = "-";
        this.tema = "-";
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

    public RolParticipante getRol() {
        return rol;
    }

    public String getEvento() {
        return Evento;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public String getTema() {
        return tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public void setRol(RolParticipante rol) {
        this.rol = rol;
    }

    public void setEvento(String Evento) {
        this.Evento = Evento;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    } 

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + ", rol=" + rol + ", Evento=" + Evento + ", asistencia=" + asistencia + ", tema=" + tema + ", descripcion=" + descripcion + '}';
    }
}
