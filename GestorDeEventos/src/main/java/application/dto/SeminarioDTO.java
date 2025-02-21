package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import lombok.Data;

@Data
public class SeminarioDTO extends EventoDTO {
    private int cantSesiones;
    private boolean gratuito;
    private boolean workShops;

    public SeminarioDTO(Set<ParticipanteDTO> listaParticipantes, String nombre, String lugar, LocalDate fecha, 
                        LocalTime horaComienzo, LocalTime horaFinalizado, int capMax, int cantSesiones, 
                        boolean gratuito, boolean workShops) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, capMax);
        this.cantSesiones = cantSesiones;
        this.gratuito = gratuito;
        this.workShops = workShops;
    }
}
