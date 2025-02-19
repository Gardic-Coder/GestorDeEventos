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

//Ayudantes, encargados de administrar tareas menores

public class Asistente extends ParticipanteDTO {
    private String encargadoDeX;
    private String Zona;

    public Asistente( String encargadoDeX, String Zona, String nombre, String cedula, String correo, String telefono, String rol, String Evento, boolean asistencia) {
        super(nombre, cedula, correo, telefono, rol, Evento, asistencia);
        this.rol= "Asistente";
        this.encargadoDeX = encargadoDeX;
        this.Zona = Zona;
    }


    public String getEncargadoDeX() {
        return encargadoDeX;
    }

    public String getZona() {
        return Zona;
    }


    public void setEncargadoDeX(String encargadoDeX) {
        this.encargadoDeX = encargadoDeX;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }
    
}
