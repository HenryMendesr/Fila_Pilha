class Pilha {
    private Elemento_Pilha topo;

    Pilha() {
        topo = null;
    }

    boolean vazia() {
        return topo == null;
    }

    void inserir(String id, String descricao, String dataHora) {
        Elemento_Pilha novo = new Elemento_Pilha(id, descricao, dataHora);
        novo.proximo = topo;
        topo = novo;
    }

    void remover() {
        if (vazia()) {
            System.out.println("pilha vazia");
            return;
        }
        System.out.println("removendo " + topo.id + " - " + topo.descricao);
        topo = topo.proximo;
    }

    void mostrar() {
        if (vazia()) {
            System.out.println("historico vazio");
            return;
        }
        System.out.println("historico de solicitacoes");
        Elemento_Pilha atual = topo;
        while (atual != null) {
            System.out.println(atual.id + " | " + atual.descricao + " | " + atual.dataHora);
            atual = atual.proximo;
        }
    }
}
