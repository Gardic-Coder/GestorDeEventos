package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class investigacionJor extends Evento {
    private String InstitucionOrganizadora;
    private String Areatematica;

    public investigacionJor(Set<Participante> listaParticipantes, String InstitucionOrganizadora, String Areatematica,
            String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax);
        this.InstitucionOrganizadora = InstitucionOrganizadora;
        this.Areatematica = Areatematica;
    }

    public String getInstitucionOrganizadora() {
        return InstitucionOrganizadora;
    }

    public String getAreatematica() {
        return Areatematica;
    }

    public void setInstitucionOrganizadora(String InstitucionOrganizadora) {
        this.InstitucionOrganizadora = InstitucionOrganizadora;
    }

    public void setAreatematica(String Areatematica) {
        this.Areatematica = Areatematica;
    }
    
}
