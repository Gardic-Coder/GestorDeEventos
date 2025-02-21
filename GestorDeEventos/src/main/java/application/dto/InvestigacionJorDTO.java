package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class InvestigacionJorDTO extends EventoDTO{
    private String institucionOrganizadora;
    private String areaTematica;

    public InvestigacionJorDTO(Set<ParticipanteDTO> listaParticipantes, String nombre, String lugar, LocalDate fecha, 
                               LocalTime horaComienzo, LocalTime horaFinalizado, int capMax, 
                               String institucionOrganizadora, String areaTematica) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, capMax);
        this.institucionOrganizadora = institucionOrganizadora;
        this.areaTematica = areaTematica;
    }

    public String getInstitucionOrganizadora() {
        return institucionOrganizadora;
    }

    public void setInstitucionOrganizadora(String institucionOrganizadora) {
        this.institucionOrganizadora = institucionOrganizadora;
    }

    public String getAreaTematica() {
        return areaTematica;
    }

    public void setAreaTematica(String areaTematica) {
        this.areaTematica = areaTematica;
    }

    @Override
    public String toString() {
        return "InvestigacionJorDTO{" + "institucionOrganizadora=" + institucionOrganizadora + ", areaTematica=" + areaTematica + '}';
    }
}
