package composição.desafiocomposicao;

public class CarrinhoTeste {

    public static void main(String[] args) {
        Cliente rafael = new Cliente("Rafael");

        Produto prod1 = new Produto("Caneta", 2.00);
        Produto prod2 = new Produto("Calculadora", 35.00);
        Produto prod3 = new Produto("Borracha", 2.00);
        Produto prod4 = new Produto("Notebook", 2300.00);
        Produto prod5 = new Produto("Clips", 0.50);

        Compra compra1 = new Compra(rafael);

        Item item1 = new Item(prod1, compra1, 5);
        Item item2 = new Item(prod2, compra1, 1);
        Item item3 = new Item(prod3, compra1, 2);
        Item item4 = new Item(prod4, compra1, 1);
        Item item5 = new Item(prod5, compra1, 250);

        compra1.listaItens.add(item1);
        compra1.listaItens.add(item2);
        compra1.listaItens.add(item3);
        compra1.listaItens.add(item4);
        compra1.listaItens.add(item5);


        System.out.println(rafael.listaCompras.size());
        System.out.println(compra1.listaItens.size());



        System.out.println(rafael.obterValorTotal());
    }

}
