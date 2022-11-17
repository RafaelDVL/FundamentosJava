package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSet {

    public static void main(String[] args) {
        HashSet conj = new HashSet();

        conj.add(1.2); // double -> Double (ele converte pelo fato de arrays nao aceitarem tipo primitivos)
        conj.add(true);
        conj.add("Teste");
        conj.add(1);
        conj.add('x');

        System.out.println(conj.size());

        conj.remove("Teste");

        // System.out.println(conj.size());

        System.out.println(conj.contains('x'));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conj);

        // conj.addAll(nums);

        // System.out.println(conj);

        conj.retainAll(nums);
        System.out.println(conj);

        conj.clear();

        System.out.println(conj);
    }
}
