package Cadastro_Produto;

public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibirDetalhes();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco;
    }
}
