package main.java.application.dto;

public enum RolParticipante {
    ASISTENTE(false, 5),
    CONFERENCISTA(true, 2),
    INSTRUCTOR(false, 4),
    PONENTE(true, 3),
    MODERADOR(false, 1);
    
    private final boolean tieneTema;
    private final int prioridad;
    
    RolParticipante(boolean tieneTema, int prioridad) {
        this.tieneTema = tieneTema;
        this.prioridad = prioridad;
    }

    public boolean isTieneTema() {
        return tieneTema;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
