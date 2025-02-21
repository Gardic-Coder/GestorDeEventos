package main.java.domain;

public enum RolParticipante {
    ASISTENTE(false),
    CONFERENCISTA(true),
    INSTRUCTOR(false),
    PONENTE(true),
    MODERADOR(false),
    OYENTE(false);
    
    private final boolean tieneTema;
    
    RolParticipante(boolean tieneTema) {
        this.tieneTema = tieneTema;
    }

    public boolean isTieneTema() {
        return tieneTema;
    }
    
}
