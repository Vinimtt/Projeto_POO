package Gerenciador_de_Eventos;

public class Main {
    public static void main(String[] args) {
        //  Criação de locais
        Local local1 = new Local("Loyolab", "universidade catolica");
        Local local2 = new Local("Auditorio g2", "Campus party");

        // Criação de eventos
        Evento evento1 = new Evento("Workshop de Java", local1, 5);
        Evento evento2 = new Evento("Seminário de Tecnologia", local2, 4);

        // Adicionar participantes ao evento 1
        evento1.adicionarParticipante("João Silva", "joao.silva@email.com", "11987654321");
        evento1.adicionarParticipante("Maria Oliveira", "maria.oliveira@email.com", "11912345678");
        evento1.adicionarParticipante("thiago tahim", "ThiagoTahm@gmail.com","81989898989");
        evento1.adicionarParticipante("Carlos Souza", "carlos.souza@email.com", "11911223344");

        // Tentativa de adicionar participante além da capacidade
        evento1.adicionarParticipante("ytalo souza", "ytalo.souza@email.com", "1163424523344");

       

        // Adicionar participantes ao evento 2
        evento2.adicionarParticipante("Pablo", "pablo@email.com", "819898989");
        evento2.adicionarParticipante("Vini", "vini@email.com", "9821982912");

        // mostrar participantes evento 1
        System.out.println("\n Participantes evento 1");
        evento1.listarParticipantes();

        // mostrar participantes do evento 2
        System.out.println("\nParticipantes do evento 2:");
        evento2.listarParticipantes();

        System.out.println("\n\n");

        // Verificar se os eventos estão cheios
        if (evento1.estaLotado()) {
            System.out.println("O evento '" + evento1.getNome() + "' está cheio.");
        } else {
            System.out.println("O evento '" + evento1.getNome() + "' ainda tem vagas.");
        }

        if (evento2.estaLotado()) {
            System.out.println("O evento '" + evento2.getNome() + "' está cheio.");
        } else {
            System.out.println("O evento '" + evento2.getNome() + "' ainda tem vagas.");
        }

        // Exibir o evento mais visitado
        Evento maisVisitado = Evento.eventoMaisVisitado();
        if (maisVisitado != null) {
            System.out.println("O evento mais visitado é: " + maisVisitado.getNome() + " com " +
                    maisVisitado.getParticipantes().size() + "pessoas");
        } else {
            System.out.println("Nenhum evento encontrado.");
        }

        // Ver a interface gráfica dos eventos
        EventoGUI.mostrarEventos(Evento.getListaEventos()); 
        
        /*  2 parte do main para testar outras funcionalidades
        
        evento1.removerParticipante("João Silva");
        evento1.removerParticipante("Maria Oliveira");
        evento1.removerParticipante("thiago tahim");

        evento2.removerParticipante("pablo");

        // Listar os participantes restantes no evento 1 depois da remoção
        System.out.println("\nParticipantes restantes do evento 1:");
        evento1.listarParticipantes();

        // Listar participantes restantes no evento 2 depois da remoção
        System.out.println("\nParticipantes do evento 2:");
        evento2.listarParticipantes();

        // Apagar o evento Seminário de Tecnologia
        Evento.apagarEvento("Seminário de Tecnologia");


        // Listar os eventos restantes
        System.out.println("\nEventos restantes:");
        for (Evento evento : Evento.getListaEventos()) {
            System.out.println("Evento: " + evento.getNome());
        }

        
        
                
        
        
              
        
                // Verificar se o evento foi removido corretamente
                System.out.println("\nTentando remover 'Carlos Souza' de um evento apagado:");
                evento2.removerParticipante("Carlos Souza");

                EventoGUI.mostrarEventos(Evento.getListaEventos());
                
      */
        
        
    }
}
