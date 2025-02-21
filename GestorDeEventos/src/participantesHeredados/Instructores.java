/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participantesHeredados;
import ClasesAbstractas.dto.ParticipanteDTO;
/**
 *
 * @author Alejandrito
 */

//Instructores, Responsables de impartir talleres o cursos, enseñando habilidades específicas.

public class Instructores extends ParticipanteDTO {
    private String especialidad;
    private int añosExperiencia;
    private String tipoEnsenanza;

    public Instructores(String especialidad, int añosExperiencia, String tipoEnsenanza, String nombre, String cedula, String correo, String telefono, String rol, String Evento, boolean asistencia) {
        super(nombre, cedula, correo, telefono, rol, Evento, asistencia);
        this.rol= "Instructores";
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.tipoEnsenanza = tipoEnsenanza;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getTipoEnsenanza() {
        return tipoEnsenanza;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setTipoEnsenanza(String tipoEnsenanza) {
        this.tipoEnsenanza = tipoEnsenanza;
    }
    
    
    
    
}
