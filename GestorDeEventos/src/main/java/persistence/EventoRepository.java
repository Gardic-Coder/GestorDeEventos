package main.java.persistence;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import main.java.domain.TipoEvento;
import main.java.application.dto.*;

public class EventoRepository implements IEventoRepository{
    private final String ARCHIVO = "src\\main\\resources\\eventos.txt";

    @Override
    public List<EventoDTO> cargarEventos() {
        List<EventoDTO> eventos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Evento.inicializarContador(eventos); // Inicializar contador
        return eventos;
    }

    @Override
    public void guardarEventos(List<EventoDTO> eventos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (EventoDTO evento : eventos) {
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
