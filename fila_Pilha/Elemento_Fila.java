class Elemento_Fila {
    String nome;
    String numeroIdentificacao;
    String motivo;
    Elemento_Fila proximo;

    Elemento_Fila(String nome, String numeroIdentificacao, String motivo) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.motivo = motivo;
        this.proximo = null;
    }
}
