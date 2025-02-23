package main.java.persistence;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import main.java.application.dto.TipoEvento;
import main.java.application.dto.*;

public class EventoRepository implements IEventoRepository {

    private final String ARCHIVO = "src\\main\\resources\\eventos.txt";

    @Override
    public List<EventoDTO> cargarEventos() {
        List<EventoDTO> eventos = new ArrayList<>();
        File archivo = new File(ARCHIVO);

        // Verificar si el archivo existe y no está vacío
        if (!archivo.exists() || archivo.length() == 0) {
            return eventos; // Retorna lista vacía
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
                EventoDTO evento = new EventoDTO(
                        partes[1], // nombre
                        TipoEvento.valueOf(partes[2]), // tipo
                        partes[3], // lugar
                        LocalDate.parse(partes[4]), // fecha
                        LocalTime.parse(partes[5]), // horaComienzo
                        LocalTime.parse(partes[6]), // horaFinalizado
                        Integer.parseInt(partes[7]), // CapMax
                        partes[8], // descripción
                        new TreeSet<>(), // listaParticipantes (se cargarán después)
                        partes[0] // ID
                );
                eventos.add(evento);
            }
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return eventos;
    }

    @Override
    public void guardarEventos(List<EventoDTO> eventos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (EventoDTO evento : eventos) {
                // Validar que el evento no sea nulo
                if (evento == null) {
                    continue;
                }

                String linea = String.join("|",
                        evento.getID(),
                        evento.getNombre(),
                        evento.getTipo().name(),
                        evento.getLugar(),
                        evento.getFecha().toString(),
                        evento.getHoraComienzo().toString(),
                        evento.getHoraFinalizado().toString(),
                        String.valueOf(evento.getCapMax()),
                        evento.getDescripcion()
                );
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
