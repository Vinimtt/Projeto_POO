package Clinica;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String Data;

    public Consulta(Paciente paciente, Medico medico, String Data){
        this.paciente = paciente;
        this.medico = medico;
        this.Data = Data; 
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getData() {
        return Data;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

}
