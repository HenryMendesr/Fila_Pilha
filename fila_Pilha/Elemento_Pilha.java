class Elemento_Pilha {
    String id;
    String descricao;
    String dataHora;
    Elemento_Pilha proximo;

    Elemento_Pilha(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.proximo = null;
    }
}
