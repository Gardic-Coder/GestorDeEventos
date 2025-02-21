package main.java.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

//Seminario: Eventos más interactivos, donde los asistentes participan activamente en discusiones o talleres.

public class Seminario extends Evento {
    private int cantSesiones;
    private boolean gratuito;
    private boolean workShops;

    public Seminario(Set<Participante> listaParticipantes, int cantSesiones, boolean gratuito, boolean workShops, String nombre, String lugar, LocalDate fecha, LocalTime horaComienzo, LocalTime horaFinalizado, int CapMax) {
        super(listaParticipantes, nombre, lugar, fecha, horaComienzo, horaFinalizado, CapMax);
        this.cantSesiones = cantSesiones;
        this.gratuito = gratuito;
        this.workShops = workShops;
    }

    public int getCantSesiones() {
        return cantSesiones;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public boolean isWorkShops() {
        return workShops;
    }

    public void setCantSesiones(int cantSesiones) {
        this.cantSesiones = cantSesiones;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public void setWorkShops(boolean workShops) {
        this.workShops = workShops;
    }

    @Override
    public String toString() {
        return "Seminario{" + "cantSesiones=" + cantSesiones + ", gratuito=" + gratuito + ", workShops=" + workShops + '}';
    }
    
}
