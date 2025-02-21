package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class TallerDTO extends EventoDTO{
    private String nivelDificultad;
    private boolean esPractico;

    public TallerDTO(Set<ParticipanteDTO> listaParticipantes, String nombre, String lugar, LocalDate fecha, 
                     LocalTime horaComienzo, LocalTime horaFinalizado, int capMax, String nivelDificultad, 
                     boolean esPractico) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, capMax);
        this.nivelDificultad = nivelDificultad;
        this.esPractico = esPractico;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public boolean isEsPractico() {
        return esPractico;
    }

    public void setEsPractico(boolean esPractico) {
        this.esPractico = esPractico;
    }

    @Override
    public String toString() {
        return "TallerDTO{" + "nivelDificultad=" + nivelDificultad + ", esPractico=" + esPractico + '}';
    }
}
