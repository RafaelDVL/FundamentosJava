package ArraysCollections;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        double[] notasAlunosA = new double[6];

        notasAlunosA[0] = 10.0;
        notasAlunosA[1] = 7.0;
        notasAlunosA[2] = 8.0;
        notasAlunosA[3] = 7.5;
        notasAlunosA[4] = 9.0;
        notasAlunosA[5] = 6.5;

        System.out.println(Arrays.toString(notasAlunosA));

        double resultA = 0.0;
        for(int i = 0; i < notasAlunosA.length; i++ ){
            resultA += notasAlunosA[i];
            System.out.println(resultA);
        }
        System.out.println( "A media de notas da sala foi de " + resultA/notasAlunosA.length);


        double [] notasAlunosB = { 6.9, 8.9, 5.5, 10 };

        double resultB = 0.0;
        for(int i = 0; i < notasAlunosB.length; i++ ){
            resultB += notasAlunosB[i];
            System.out.println(resultB);
        }

        System.out.println( "A media de notas da sala B foi de " + resultB/notasAlunosB.length);
    }

}
