package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("RafaelBook");
        livros.push("EduardoBook");
        livros.add("MarceloBook");
        livros.add("MariaBook");
        livros.add("EdsonBook");

        System.out.println(livros);

        System.out.println(livros.poll());
        System.out.println(livros.pop());

        System.out.println(livros.size());
        System.out.println(livros);

    }
}
