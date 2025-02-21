package main.java.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

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

    public int getCantSesiones() {
        return cantSesiones;
    }

    public void setCantSesiones(int cantSesiones) {
        this.cantSesiones = cantSesiones;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public boolean isWorkShops() {
        return workShops;
    }

    public void setWorkShops(boolean workShops) {
        this.workShops = workShops;
    }

    @Override
    public String toString() {
        return "SeminarioDTO{" + "cantSesiones=" + cantSesiones + ", gratuito=" + gratuito + ", workShops=" + workShops + '}';
    }
}
