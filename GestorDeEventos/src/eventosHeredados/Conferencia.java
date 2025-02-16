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
 * @author Ale
 */

/*Conferencia: Suelen ser eventos formales donde un experto o varios expositores 
               presentan temas específicos a una audiencia.
*/
public class Conferencia extends EventoDTO {
    private String temaPrincipal;

    public Conferencia(String temaPrincipal, Set<Asistente> listAsistentes, Set<Ponentes> listPonentes, Set<Instructores> listInstructores, Set<Conferencista> listConferencistas, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, moderadores organizador) {
        super(listAsistentes, listPonentes, listInstructores, listConferencistas, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax, organizador);
        this.temaPrincipal = temaPrincipal;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }
    
    
    
    
}
