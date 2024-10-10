package Clinica;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RelatorioGUI {

    private static JTextArea textArea;

    public static void mostrarRelatorio(List<Consulta> consultas) {
        // Criando o JFrame para a janela
        JFrame frame = new JFrame("Relatório de Consultas");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextArea para mostrar as informações
        textArea = new JTextArea();
        textArea.setEditable(false);

        // Scroll para o JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Tornando a janela visível
        frame.setVisible(true);

        // Exibindo o relatório das consultas
        StringBuilder relatorio = new StringBuilder("Consultas:\n");
        for (Consulta c : consultas) {
            relatorio.append("Paciente: ").append(c.getPaciente().getNomePaciente())
                    .append(" | Idade: ").append(c.getPaciente().getIdade())
                    .append(" | Tipo sanguíneo: ").append(c.getPaciente().getTipoSanguineo()).append("\n");
            relatorio.append("Médico: ").append(c.getMedico().getNomeMedico())
                    .append(" | CRM: ").append(c.getMedico().getCRM()).append("\n");
            relatorio.append("Data: ").append(c.getData()).append("\n\n");
        }

        // Adiciona o relatório ao JTextArea
        textArea.setText(relatorio.toString());
    }

    public static void exibirMensagem(String mensagem) {
        textArea.append(mensagem + "\n");
    }
}
