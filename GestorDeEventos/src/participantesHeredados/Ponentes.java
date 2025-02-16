/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participantesHeredados;
import ClasesAbstractas.dto.ParticipanteDTO;
import java.time.LocalTime;
/**
 *
 * @author Alejandrito
 */

//Personas a participar en cierto evento informativo; brindan informacion de un tema en especifico

public class Ponentes extends ParticipanteDTO {
    private String Tema;
    private String Institucion;
    //Biografia?
    private LocalTime tiempoExponencia;

    public Ponentes(String Tema, LocalTime tiempoExponencia, String Institucion, String nombre, String cedula, String correo, String telefono, String rol, String Evento, boolean asistencia) {
        super(nombre, cedula, correo, telefono, rol, Evento, asistencia);
        this.rol="Ponente";
        this.Tema = Tema;
        this.Institucion= Institucion;
        this.tiempoExponencia = tiempoExponencia;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }

    public String getTema() {
        return Tema;
    }

    public LocalTime getTiempoExponencia() {
        return tiempoExponencia;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public void setTiempoExponencia(LocalTime tiempoExponencia) {
        this.tiempoExponencia = tiempoExponencia;
    }
}
