package Cadastro_Produto;

public class Eletronico extends Produto {
    private boolean possuiWiFI;

    public Eletronico(String nome, double preco, boolean possuiWiFI) {
        super(nome, preco);
        this.possuiWiFI = possuiWiFI;
    }

    public boolean isPossuiWiFI() {
        return possuiWiFI;
    }

    public void ligar() {
        System.out.println("O produto eletrônico " + getNome() + " está ligado.");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this + ", Possui Wi-Fi: " + possuiWiFI);
    }
}
