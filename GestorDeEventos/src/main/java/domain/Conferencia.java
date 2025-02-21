package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

/*Conferencia: Suelen ser eventos formales donde un experto o varios expositores 
               presentan temas específicos a una audiencia.
*/
public class Conferencia extends Evento {
    private String temaPrincipal;

    public Conferencia(Set<Participante> listaParticipantes, String temaPrincipal, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax);
        this.temaPrincipal = temaPrincipal;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }
    
}
