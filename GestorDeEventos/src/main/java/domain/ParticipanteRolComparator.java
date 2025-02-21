package main.java.domain;

import java.util.Comparator;

public class ParticipanteRolComparator implements Comparator<Participante> {
    @Override
    public int compare(Participante p1, Participante p2) {
        return Integer.compare(p1.getRol().getPrioridad(), p2.getRol().getPrioridad());
    }
}