# Projeto de Estruturas de Dados em Java

## Descrição

Este projeto implementa duas estruturas de dados básicas em Java — **Fila** e **Pilha** — usando listas encadeadas.  
O código foi feito sem o uso de bibliotecas ou estruturas prontas, seguindo as restrições da disciplina.  
O objetivo é demonstrar o funcionamento prático das operações de inserção, remoção e exibição em estruturas dinâmicas.

---

## Estrutura do Projeto

src/
├── Elemento_Fila.java
├── Elemento_Pilha.java
├── Fila.java
├── Pilha.java
└── Main.java


### Descrição dos Arquivos

- **Elemento_Fila.java** – Define o nó usado na fila, com nome, número de identificação e motivo.  
- **Elemento_Pilha.java** – Define o nó usado na pilha, com id, descrição e data/hora.  
- **Fila.java** – Implementa a fila encadeada (estrutura FIFO).  
- **Pilha.java** – Implementa a pilha encadeada (estrutura LIFO).  
- **Main.java** – Classe principal que cria e testa as duas estruturas.

---

## Regras do Trabalho

- Proibido usar: `Array`, `ArrayList`, `LinkedList`, `List`, `Queue`, `Stack`, `StringBuilder` e qualquer tipo abstrato pronto.  
- Permitido: `String`, `int`, `float`, `try-catch`, `throws`, e funções básicas de entrada e saída (`System.out`, `Scanner`, etc.).  
- O uso de `length` é permitido apenas em **Strings**.

---

## Estruturas e Operações

### Fila (FIFO)
- **enfileirar(nome, numero, motivo)** → adiciona um novo cliente no fim da fila.  
- **atender()** → remove o primeiro da fila.  
- **mostrar()** → exibe todos os clientes em ordem.  
- **vazia()** → verifica se a fila está vazia.

### Pilha (LIFO)
- **inserir(id, descricao, dataHora)** → empilha um novo registro no topo.  
- **remover()** → remove o elemento do topo.  
- **mostrar()** → exibe o histórico da pilha.  
- **vazia()** → verifica se a pilha está vazia.

---

## Exemplo de Execução (Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Pilha historico = new Pilha();
        historico.inserir("req001", "instalacao de software", "2024-08-20 10:30");
        historico.inserir("req002", "manutencao preventiva", "2024-08-20 11:00");
        historico.mostrar();
        historico.remover();
        historico.mostrar();

        Fila atendimento = new Fila();
        atendimento.enfileirar("maria silva", "cli001", "duvida sobre produto");
        atendimento.enfileirar("joao souza", "cli002", "reclamacao de servico");
        atendimento.mostrar();
        atendimento.atender();
        atendimento.mostrar();
    }
}
historico de solicitacoes
req002 | manutencao preventiva | 2024-08-20 11:00
req001 | instalacao de software | 2024-08-20 10:30
removendo req002 - manutencao preventiva
historico de solicitacoes
req001 | instalacao de software | 2024-08-20 10:30

fila de atendimento
cli001 | maria silva | duvida sobre produto
cli002 | joao souza | reclamacao de servico
atendendo cli001 - maria silva - duvida sobre produto
fila de atendimento
cli002 | joao souza | reclamacao de servico


```java

javac *.java
java Main

Informações do Trabalho

Universidade: Pontifícia Universidade Católica do Paraná (PUCPR)
Disciplina: Resolução de Problemas Estruturados em Computação
Professor: Andrey Cabral Meira

Integrantes (ordem alfabética):

Henry Mendes

Kaue Fontoura

Matheus Bernardi

Rafael Maluf
