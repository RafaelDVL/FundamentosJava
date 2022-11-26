package composição.desafiocomposicao;

import java.util.ArrayList;

public class Produto {


    String nomeProduto;
    double preco;

    final ArrayList<Item> listaItens = new ArrayList<>();

    Produto(String nomeProdutoUSer, double precoProd){
        this.nomeProduto = nomeProdutoUSer;
        this.preco = precoProd;
    }
}
