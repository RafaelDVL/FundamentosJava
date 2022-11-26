package composição.desafiocomposicao;



public class Item {

    int quantidade;

    Produto produto;

    Compra compra;

    Item(Produto produtoUser, Compra compraUser, int quantidade){
        this.produto = produtoUser;
        this.compra = compraUser;
        this.quantidade = quantidade;
        produtoUser.listaItens.add(this);
    }

}
