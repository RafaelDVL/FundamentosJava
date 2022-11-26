package composição.desafiocomposicao;

import java.util.ArrayList;

public class Cliente {

    String nomeCliente;

    final ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente(String nome){
        this.nomeCliente = nome;
    }


    double obterValorTotal(){
        double acumul = 0;
        for (Compra compra: listaCompras
             ) {
            acumul += compra.obterValorDaCompra();
        }
        return acumul;
    }
}
