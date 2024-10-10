package Evento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class EventoGUI {

    public static void mostrarEventos(List<Evento> eventos) {
        JFrame frame = new JFrame("Gerenciador de Eventos");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Criar o conteúdo da lista de eventos
        StringBuilder eventoList = new StringBuilder();
        for (Evento evento : eventos) {
            eventoList.append("Evento: ").append(evento.getNome())
                    .append(" | Local: ").append(evento.getLocal().getNome())
                    .append(" | Capacidade Máxima: ").append(evento.getCapacidadeMaxima()).append("\n");

            eventoList.append("Participantes:\n");
            for (Participante participante : evento.getParticipantes()) {
                eventoList.append("\t").append(participante.getNome())
                        .append(" (Email; ").append(participante.getEmail())
                        .append(", Número; ").append(participante.getNumero()).append("\n");
            }
            eventoList.append("\n");
        }
        textArea.setText(eventoList.toString());

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
