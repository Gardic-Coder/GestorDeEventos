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
public class Taller extends EventoDTO {
    private String nivelDificultad;
    private boolean esPractico;
    //Material necesario???

    public Taller(String nivelDificultad, boolean esPractico, Set<Asistente> listAsistentes, Set<Ponentes> listPonentes, Set<Instructores> listInstructores, Set<Conferencista> listConferencistas, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, moderadores organizador) {
        super(listAsistentes, listPonentes, listInstructores, listConferencistas, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax, organizador);
        this.nivelDificultad = nivelDificultad;
        this.esPractico = esPractico;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public boolean isEsPractico() {
        return esPractico;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setEsPractico(boolean esPractico) {
        this.esPractico = esPractico;
    }
    
    
    
    
    
}
