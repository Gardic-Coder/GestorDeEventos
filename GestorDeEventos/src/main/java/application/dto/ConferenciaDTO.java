package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import lombok.Data;

@Data
public class ConferenciaDTO extends EventoDTO{
    private String temaPrincipal;

    public ConferenciaDTO(Set<ParticipanteDTO> listaParticipantes, String nombre, String lugar, LocalDate fecha, 
                          LocalTime horaComienzo, LocalTime horaFinalizado, int capMax, String temaPrincipal) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, capMax);
        this.temaPrincipal = temaPrincipal;
    }
}
