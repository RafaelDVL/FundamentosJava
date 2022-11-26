package composição.umparamuitos;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.itens.add(new Item("Galaxy s5", 10, 20.00));
        c1.itens.add(new Item("Iphone 10", 2, 10.00));
        c1.itens.add(new Item("Tablet", 5, 30.00));
        c1.adicionarItem(new Item("Fone Jbl",8, 5.00));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
    }
}
