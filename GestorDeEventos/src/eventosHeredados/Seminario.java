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
 * @author Alejandro
 */

//Seminario: Eventos más interactivos, donde los asistentes participan activamente en discusiones o talleres.

public class Seminario extends EventoDTO {
    private int cantSesiones;
    private boolean gratuito;
    private boolean workShops;

    public Seminario(int cantSesiones, boolean gratuito, boolean workShops, Set<Asistente> listAsistentes, Set<Ponentes> listPonentes, Set<Instructores> listInstructores, Set<Conferencista> listConferencistas, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, moderadores organizador) {
        super(listAsistentes, listPonentes, listInstructores, listConferencistas, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax, organizador);
        this.cantSesiones = cantSesiones;
        this.gratuito = gratuito;
        this.workShops = workShops;
    }

    public int getCantSesiones() {
        return cantSesiones;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public boolean isWorkShops() {
        return workShops;
    }

    public void setCantSesiones(int cantSesiones) {
        this.cantSesiones = cantSesiones;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public void setWorkShops(boolean workShops) {
        this.workShops = workShops;
    }
    
}
