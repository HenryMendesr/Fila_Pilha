class Fila {
    private Elemento_Fila frente;
    private Elemento_Fila tras;

    Fila() {
        frente = null;
        tras = null;
    }

    boolean vazia() {
        return frente == null;
    }

    void enfileirar(String nome, String numeroIdentificacao, String motivo) {
        Elemento_Fila novo = new Elemento_Fila(nome, numeroIdentificacao, motivo);
        if (vazia()) {
            frente = novo;
            tras = novo;
        } else {
            tras.proximo = novo;
            tras = novo;
        }
    }

    void atender() {
        if (vazia()) {
            System.out.println("fila vazia");
            return;
        }
        System.out.println("atendendo " + frente.numeroIdentificacao + " - " + frente.nome + " - " + frente.motivo);
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
    }

    void mostrar() {
        if (vazia()) {
            System.out.println("fila vazia");
            return;
        }
        System.out.println("fila de atendimento");
        Elemento_Fila atual = frente;
        while (atual != null) {
            System.out.println(atual.numeroIdentificacao + " | " + atual.nome + " | " + atual.motivo);
            atual = atual.proximo;
        }
    }
}
