package Evento;

public class Participante {
    private String nome;
    private String email;
    private String numero;

    // Construtor
    public Participante(String nome, String email, String numero) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNumero() {
        return numero;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Participante: " + nome + " (Email: " + email + ", Número: " + numero + ")";
    }
}
