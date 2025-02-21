package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class ConferenciaDTO extends EventoDTO{
    private String temaPrincipal;

    public ConferenciaDTO(Set<ParticipanteDTO> listaParticipantes, String nombre, String lugar, LocalDate fecha, 
                          LocalTime horaComienzo, LocalTime horaFinalizado, int capMax, String temaPrincipal) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, capMax);
        this.temaPrincipal = temaPrincipal;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }

    @Override
    public String toString() {
        return "ConferenciaDTO{" + "temaPrincipal=" + temaPrincipal + '}';
    }
    
}
