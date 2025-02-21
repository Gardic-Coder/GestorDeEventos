package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import lombok.Data;

@Data
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
}
