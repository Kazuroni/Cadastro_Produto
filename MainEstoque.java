package Cadastro_Produto;

import java.util.ArrayList;

public class MainEstoque {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        // Adicionando produtos ao estoque
        estoque.add(new Eletronico("Smartphone", 1200.0, true));
        estoque.add(new Roupa("Camiseta", 29.9, "M"));
        estoque.add(new Eletronico("Tablet", 800.0, true));
        estoque.add(new Roupa("Calça Jeans", 59.9, "G"));

        // Iterando e realizando operações comuns
        for (Produto produto : estoque) {
            System.out.println(produto);
            produto.exibirDetalhes();
            // Aqui você pode realizar outras operações comuns, como ligar eletrônicos,
            // vestir roupas, etc.
        }
    }
}
