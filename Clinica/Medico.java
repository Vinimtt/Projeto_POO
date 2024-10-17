package Clinica;

public class Medico {
    private String nomeMedico;
    private int CRM;
    private boolean Disponivel;

    public Medico(String nomeMedico, int CRM, boolean Disponivel){
        this.nomeMedico = nomeMedico;
        this.CRM = CRM;
        this.Disponivel = true;
    }

    public int getCRM() {
        return CRM;
    }

    public boolean isDisponivel(){
        return Disponivel;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setCRM(int cRM) {
        CRM = cRM;
    }

    public void setDisponivel(boolean Disponivel) {
        this.Disponivel = Disponivel;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void Disponivel(boolean Disponivel){
        if(Disponivel == true){
            System.out.println("Medico está disponível!");
        }
        else{
            System.out.println("Medico indisponivel!");;
        }
    }

}
