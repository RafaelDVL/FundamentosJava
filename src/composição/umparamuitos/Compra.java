package composição.umparamuitos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;

        for (Item item: itens
             ) {
            total += item.quantidade * item.preco;
        }

        return total;
    }

    public void printAll(){
        for (Item item: itens
             ) {
            System.out.println("Item => " + item.nome);
            System.out.println("Quant => " + item.quantidade);
            System.out.println("Preco => " + item.preco);
        }
    }
}
