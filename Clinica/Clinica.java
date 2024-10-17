package Clinica;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Consulta> consultas;

    public Clinica(){
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void addPacientes(Paciente paciente){
        pacientes.add(paciente);

    }

    public void addMedicos(Medico medico){
        medicos.add(medico);
    }

    public void addConsulta(Paciente paciente, Medico medico, String data){
        Consulta consulta = new Consulta(paciente, medico, data);
        consultas.add(consulta);
    }

    public void searchPaciente(Paciente paciente){
        for(Paciente paciente2: pacientes){
            if(paciente2.equals(paciente)){
                RelatorioGUI.exibirMensagem(paciente.getNomePaciente() + " Achado");
            }
        }
    }

    public void Relatorio(){
        RelatorioGUI.mostrarRelatorio(consultas);
    }

    public void searchTipoSanguineo(String a){
        for(Paciente pacientea: pacientes){
            if(pacientea.getTipoSanguineo().equals(a)){
                RelatorioGUI.exibirMensagem(pacientea.getNomePaciente() + " Pode doar");
            }
        }
    }

    public void searchDisponivel(Medico medico){
        boolean disponivel = true;
        for (Consulta consulta : consultas) {
            if (consulta.getMedico().equals(medico)) {
                disponivel = false;
                break;
            }
        }
    
    
        if (disponivel) {
            RelatorioGUI.exibirMensagem("Médico " + medico.getNomeMedico() + " está disponível.");
        } else {
            RelatorioGUI.exibirMensagem("Médico " + medico.getNomeMedico() + " está indisponível.");
        }
    }   

    }
