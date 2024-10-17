package Clinica;

public class MainC {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        Paciente paciente = new Paciente("Teste 1",20,"B");
        clinica.addPacientes(paciente);

        Paciente paciente2 = new Paciente("Teste 2",56,"O");
        clinica.addPacientes(paciente2);

        Paciente paciente3 = new Paciente("Teste 3",31,"O");
        clinica.addPacientes(paciente3);

        Paciente paciente4 = new Paciente("Teste 3",31,"O");
        clinica.addPacientes(paciente4);

        Medico medico = new Medico("Doutor teste",1,true);
        clinica.addMedicos(medico);

        Medico medico2 = new Medico("Doutor teste2",2,true);
        clinica.addMedicos(medico2);

        Medico medico3 = new Medico("Doutor teste3",3,true);
        clinica.addMedicos(medico3);

        clinica.addConsulta(paciente, medico, "11/10/2024");

        clinica.addConsulta(paciente2, medico2, "12/10/2024");  

        clinica.addConsulta(paciente3, medico3, "13/10/2024");

        clinica.Relatorio();
        
        clinica.searchPaciente(paciente);

        clinica.searchPaciente(paciente2);

        clinica.searchPaciente(paciente3);

        clinica.searchTipoSanguineo("O-");

        clinica.searchTipoSanguineo("AB");

        clinica.searchDisponivel(medico);

        clinica.searchDisponivel(medico3);

        clinica.searchDisponivel(medico2);

    } 
}
