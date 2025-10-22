public class Main {
    public static void main(String[] args) {

        Pilha historico = new Pilha();
        historico.inserir("req001", "instalacao de software", "2024-08-20 10:30");
        historico.inserir("req002", "manutencao preventiva", "2024-08-20 11:00");
        historico.inserir("req003", "atualizacao de sistema", "2024-08-20 11:30");
        historico.inserir("req004", "suporte tecnico", "2024-08-20 12:00");
        historico.inserir("req005", "troca de equipamento", "2024-08-20 12:30");
        historico.inserir("req006", "consulta de garantia", "2024-08-20 13:00");
        historico.inserir("req007", "reparo de impressora", "2024-08-20 13:30");
        historico.inserir("req008", "configuracao de rede", "2024-08-20 14:00");
        historico.inserir("req009", "restauracao de dados", "2024-08-20 14:30");
        historico.inserir("req010", "consulta tecnica", "2024-08-20 15:00");

        historico.mostrar();
        historico.remover();
        historico.mostrar();

        Fila atendimento = new Fila();
        atendimento.enfileirar("maria silva", "cli001", "duvida sobre produto");
        atendimento.enfileirar("joao souza", "cli002", "reclamacao de servico");
        atendimento.enfileirar("ana costa", "cli003", "solicitacao de reembolso");
        atendimento.enfileirar("pedro alves", "cli004", "informacoes de entrega");
        atendimento.enfileirar("carla dias", "cli005", "agendamento de visita");
        atendimento.enfileirar("lucas martins", "cli006", "alteracao de pedido");
        atendimento.enfileirar("patricia rocha", "cli007", "cancelamento de contrato");
        atendimento.enfileirar("rafael lima", "cli008", "renovacao de assinatura");
        atendimento.enfileirar("fernanda gomes", "cli009", "suporte para instalacao");
        atendimento.enfileirar("carlos eduardo", "cli010", "pedido de orcamento");

        atendimento.mostrar();
        atendimento.atender();
        atendimento.mostrar();
    }
}
