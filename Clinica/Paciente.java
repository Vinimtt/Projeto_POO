package Clinica;

public class Paciente {
    private String nomePaciente;
    private int Idade;
    private String tipoSanguineo;

    public Paciente(String nomePaciente, int Idade, String tipoSanguinheo){
        this.nomePaciente = nomePaciente;
        this.Idade = Idade;
        this.tipoSanguineo = tipoSanguinheo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public int getIdade() {
        return Idade;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

}
