package composição.desafiocomposicao;

import java.util.ArrayList;

public class Compra {

    Cliente cliente;

    final ArrayList<Item> listaItens = new ArrayList<>();

    Compra(Cliente cliente){
        this.cliente = cliente;
        cliente.listaCompras.add(this);
    }


    double obterValorDaCompra() {
        double somatotal = 0;
        for (Item item: listaItens) {
            somatotal += item.quantidade * item.produto.preco;
            System.out.println(item.produto.nomeProduto);
            System.out.println(item.quantidade);
            System.out.println(item.produto.preco);
            System.out.println(somatotal);
        }
        return somatotal;
    }
}
