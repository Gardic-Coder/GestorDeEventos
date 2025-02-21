package main.java.application.dto;

import main.java.domain.RolParticipante;
import lombok.Data;

@Data // Genera automáticamente getters, setters, toString, equals y hashCode
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
}
