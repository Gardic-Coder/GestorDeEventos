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
public class Conferencista extends ParticipanteDTO {
    private String empresa;
    private String Cargoempresa;
    private String temaConferencia;

    public Conferencista(String empresa, String Cargoempresa, String temaConferencia, String nombre, String cedula, String correo, String telefono, String rol, String Evento, boolean asistencia) {
        super(nombre, cedula, correo, telefono, rol, Evento, asistencia);
        this.rol="Conferencista";
        this.empresa = empresa;
        this.Cargoempresa = Cargoempresa;
        this.temaConferencia = temaConferencia;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setCargoempresa(String Cargoempresa) {
        this.Cargoempresa = Cargoempresa;
    }

    public void setTemaConferencia(String temaConferencia) {
        this.temaConferencia = temaConferencia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCargoempresa() {
        return Cargoempresa;
    }

    public String getTemaConferencia() {
        return temaConferencia;
    }
    
    
    
}
