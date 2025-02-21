package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Taller extends Evento {
    private String nivelDificultad;
    private boolean esPractico;
    //Material necesario???

    public Taller(Set<Participante> listaParticipantes, String nivelDificultad, boolean esPractico, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax);
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
