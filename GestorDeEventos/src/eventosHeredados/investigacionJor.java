/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventosHeredados;
import ClasesAbstractas.dto.EventoDTO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import participantesHeredados.Asistente;
import participantesHeredados.Conferencista;
import participantesHeredados.Instructores;
import participantesHeredados.Ponentes;
import participantesHeredados.moderadores;
/**
 *
 * @author juanm
 */
public class investigacionJor extends EventoDTO {
    private String InstitucionOrganizadora;
    private String Areatematica;

    public investigacionJor(String InstitucionOrganizadora, String Areatematica, Set<Asistente> listAsistentes, Set<Ponentes> listPonentes, Set<Instructores> listInstructores, Set<Conferencista> listConferencistas, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, moderadores organizador) {
        super(listAsistentes, listPonentes, listInstructores, listConferencistas, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax, organizador);
        this.InstitucionOrganizadora = InstitucionOrganizadora;
        this.Areatematica = Areatematica;
    }

    public String getInstitucionOrganizadora() {
        return InstitucionOrganizadora;
    }

    public String getAreatematica() {
        return Areatematica;
    }

    public void setInstitucionOrganizadora(String InstitucionOrganizadora) {
        this.InstitucionOrganizadora = InstitucionOrganizadora;
    }

    public void setAreatematica(String Areatematica) {
        this.Areatematica = Areatematica;
    }
    
    
    
}
