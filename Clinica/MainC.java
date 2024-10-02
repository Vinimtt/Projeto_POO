package Clinica;

public class MainC {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        Paciente paciente = new Paciente("Pablo Felipe",30,"A+");
        clinica.addPacientes(paciente);

        Paciente paciente2 = new Paciente("Joao Victor",20,"O");
        clinica.addPacientes(paciente2);

        Paciente paciente3 = new Paciente("Vinicius Teti",20,"O");
        clinica.addPacientes(paciente3);

        Medico medico = new Medico("Carlos Aurelio",5425,true);
        clinica.addMedicos(medico);

        Medico medico2 = new Medico("Carla Carina",256458,true);
        clinica.addMedicos(medico2);

        clinica.addConsulta(paciente, medico, null);

        clinica.addConsulta(paciente2, medico2, null);

        clinica.Relatorio();

        clinica.searchPaciente(paciente);
        clinica.searchPaciente(paciente2);

        clinica.searchTipoSanguineo("A+");
    } 
}
