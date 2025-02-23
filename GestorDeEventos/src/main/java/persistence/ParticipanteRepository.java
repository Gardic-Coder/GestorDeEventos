package main.java.persistence;

import main.java.application.dto.RolParticipante;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import main.java.application.dto.*;

import main.java.domain.*;

public class ParticipanteRepository implements IParticipanteRepository{
    private final String ARCHIVO = "src\\main\\resources\\participantes.txt";

    @Override
    public List<ParticipanteDTO> cargarParticipantes() {
        List<ParticipanteDTO> participantes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                ParticipanteDTO participante = new ParticipanteDTO(
                    partes[1], // nombre
                    partes[2], // cedula
                    partes[3], // correo
                    partes[4], // telefono
                    RolParticipante.valueOf(partes[5]), // rol
                    partes[0], // Evento (ID del evento)
                    Boolean.parseBoolean(partes[6]), // asistencia
                    partes[7], // tema
                    partes[8] // descripción
                );
                participantes.add(participante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return participantes;
    }

    @Override
    public void guardarParticipantes(List<ParticipanteDTO> participantes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (ParticipanteDTO p : participantes) {
                String linea = String.join("|",
                    p.getEvento(), // ID del evento
                    p.getNombre(),
                    p.getCedula(),
                    p.getCorreo(),
                    p.getTelefono(),
                    p.getRol().name(),
                    String.valueOf(p.isAsistencia()),
                    p.getTema(),
                    p.getDescripcion()
                );
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
