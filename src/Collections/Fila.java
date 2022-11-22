package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class   Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();


        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Rafael"); // retorna false
        fila.offer("Marcelo"); // Lança uma exceção
        fila.add("Eduardo");
        fila.offer("Karen");
        fila.add("Bruna");

        System.out.println(fila);

        for (String name: fila
             ) {
            System.out.println(name
            );
        }
        // peek e element -> Obter o proximo elemento da fila (sem remover)
        // Diferença é o comportamento que ocorre
        // quando a fila esta vazia!
        System.out.println(fila.peek()); // retorna false.
        System.out.println(fila.peek()); // retorna false.
        System.out.println(fila.element()); // Lança uma exceção.
        System.out.println(fila.element()); // Lança uma exceção.


        fila.size();
        // fila.clear();
        fila.isEmpty();


        System.out.println(fila);

        // poll e remove -> removem o primeiro elemento da fila.
        // Diferença é o comportamento que ocorre
        // quando a fila esta vazia!
        System.out.println(fila.poll()); // chama e remove o primeiro da fila (retrona false).
        System.out.println(fila.remove()); // chama e remove o primeiro da fila (lança uma exceção).

        System.out.println(fila);
    }
}
