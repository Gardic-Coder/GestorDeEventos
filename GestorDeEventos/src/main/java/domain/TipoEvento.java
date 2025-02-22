package main.java.domain;

public enum TipoEvento {
    TALLER("Taller"),
    SEMINARIO("Seminario"),
    CONFERENCIA("Conferencia"),
    INVESTIGACIONJOR("Jornada de investigacion");
    
    private final String tipo;
    
    TipoEvento(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
