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

//Jefes, encargados de dirigir el Evento

public class moderadores extends ParticipanteDTO{
    private String estiloModeracion;
    private boolean experienciaPrevia;

    public moderadores(String estiloModeracion, boolean experienciaPrevia, String nombre, String cedula, String correo, String telefono, String rol, String Evento, boolean asistencia) {
        super(nombre, cedula, correo, telefono, rol, Evento, asistencia);
        this.rol= "Moderador";
        this.estiloModeracion = estiloModeracion;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getEstiloModeracion() {
        return estiloModeracion;
    }

    public boolean isExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setEstiloModeracion(String estiloModeracion) {
        this.estiloModeracion = estiloModeracion;
    }

    public void setExperienciaPrevia(boolean experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }
     
}
