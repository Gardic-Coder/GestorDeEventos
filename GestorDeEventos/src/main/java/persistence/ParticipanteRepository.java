package main.java.persistence;

import main.java.domain.RolParticipante;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import main.java.application.dto.*;

public class ParticipanteRepository implements IParticipanteRepository {

    private final String ARCHIVO = "src\\main\\resources\\participantes.txt";

    @Override
    public List<ParticipanteDTO> cargarParticipantes() {
        List<ParticipanteDTO> participantes = new ArrayList<>();
        File archivo = new File(ARCHIVO);

        // Verificar si el archivo existe y no está vacío
        if (!archivo.exists() || archivo.length() == 0) {
            return participantes; // Retorna lista vacía
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue; // Saltar líneas vacías
                }
                String[] partes = linea.split("\\|");

                // Validar número de campos esperados
                if (partes.length != 9) { // 9 campos esperados
                    System.err.println("Línea mal formateada: " + linea);
                    continue;
                }

                // Crear DTO solo si los datos son válidos
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
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return participantes;
    }

    @Override
    public void guardarParticipantes(List<ParticipanteDTO> participantes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (ParticipanteDTO p : participantes) {
                // Validar que el participante no sea nulo
                if (p == null) {
                    continue;
                }

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
