package Collections;

import com.sun.source.tree.Tree;


import java.util.HashSet;
import java.util.Set;


public class ConjuntoSetComportado {

    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        lista.add("Rafael");
        lista.add("Eduardo");
        lista.add("Marcelo");
        lista.add("Cidinha");

        System.out.println(lista);

        for(String candidato: lista){
            System.out.println(candidato);
        }

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(8);
        numeros.add(6);
        numeros.add(7);
        numeros.add(5);



        System.out.println(numeros);
        System.out.println(numeros.contains(6));
    }
}
