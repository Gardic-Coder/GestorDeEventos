package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import participantesHeredados.moderadores;

public class Taller extends Evento {
    private String nivelDificultad;
    private boolean esPractico;
    //Material necesario???

    public Taller(String nivelDificultad, boolean esPractico, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax, moderadores organizador) {
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
