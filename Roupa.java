package Cadastro_Produto;

public class Roupa extends Produto {
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void vestir() {
        System.out.println("Vestindo a roupa " + getNome() + " de tamanho " + tamanho);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this + ", Tamanho: " + tamanho);
    }
}
