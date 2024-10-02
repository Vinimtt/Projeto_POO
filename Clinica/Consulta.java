package Clinica;
import java.util.Date;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private Date Data;

    public Consulta(Paciente paciente, Medico medico, Date Data){
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

    public Date getData() {
        return Data;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

}
