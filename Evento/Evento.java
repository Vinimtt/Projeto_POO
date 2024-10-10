package Evento;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private Local local;
    private int capacidadeMaxima;
    private List<Participante> participantes;
    // Lista de eventos estática e compartilhada entre todos os objetos Evento
    private static List<Evento> eventos = new ArrayList<>();

    // Construtor
    public Evento(String nome, Local local, int capacidadeMaxima) {
        this.nome = nome;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.participantes = new ArrayList<>();
        eventos.add(this); // Adiciona automaticamente o evento à lista estática de eventos
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public Local getLocal() {
        return local;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public static List<Evento> getEventos() {
        return eventos;
    }

    // Verifica se o evento está lotado
    public boolean estaLotado() {
        return participantes.size() >= capacidadeMaxima;
    }

    // Adiciona um participante ao evento
    public boolean adicionarParticipante(String nome, String email, String numero) {
        if (estaLotado()) {
            System.out.println("O evento está lotado. Não é possível adicionar o participante: " + nome);
            return false;
        } else {
            Participante participante = new Participante(nome, email, numero);
            participantes.add(participante);
            System.out.println("Participante '" + nome + "' adicionado , no evento evento '" + this.nome + "'.");
            return true;
        }
    }

    // Lista todos os participantes do evento
    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Nenhum participante inscrito no evento.");
        } else {
            System.out.println("Lista de participantes:");
            for (Participante participante : participantes) {
                System.out.println(participante);
            }
        }
    }
    public static Evento eventoMaisVisitado() {
        if (eventos.isEmpty()) {
            return null;  // Retorna null se não houver eventos
        }

        Evento maisVisitado = eventos.get(0);
        for (Evento evento : eventos) {
            if (evento.getParticipantes().size() > maisVisitado.getParticipantes().size()) {
                maisVisitado = evento;
            }
        }
        return maisVisitado;
    }
    public static List<Evento> getListaEventos() {
        return eventos;
    }

    public boolean removerParticipante(String nome) {
        for (Participante participante : participantes) {
            if (participante.getNome().equalsIgnoreCase(nome)) {
                participantes.remove(participante);
                System.out.println("Participante '" + nome + "' removido do evento '" + this.nome + "'.");
                return true;
            }
        }
        System.out.println("Participante '" + nome + "' não encontrado no evento '" + this.nome + "'.");
        return false;
    }
    
    public static boolean apagarEvento(String nomeEvento) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                eventos.remove(evento);
                System.out.println("Evento '" + nomeEvento + "' foi apagado.");
                return true;
            }
        }
        System.out.println("Evento '" + nomeEvento + "' não encontrado.");
        return false;
    }
}
