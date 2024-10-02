package Clinica;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RelatorioGUI {

    public static void mostrarRelatorio(List<Consulta> consultas) {
        JFrame frame = new JFrame("Relatório de Consultas");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        StringBuilder relatorio = new StringBuilder();
        for (Consulta c : consultas) {
            relatorio.append("Consulta:\n");
            relatorio.append("Paciente: ").append(c.getPaciente().getNomePaciente())
                    .append(" | Idade: ").append(c.getPaciente().getIdade())
                    .append(" | Tipo sanguíneo: ").append(c.getPaciente().getTipoSanguineo()).append("\n");
            relatorio.append("Médico: ").append(c.getMedico().getNomeMedico())
                    .append(" | CRM: ").append(c.getMedico().getCRM()).append("\n");
            relatorio.append("Data: ").append(c.getData()).append("\n\n");
        }
        
        textArea.setText(relatorio.toString());
        
        frame.setVisible(true);
    }
}
