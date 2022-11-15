package ArraysCollections;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        double[] notasAlunos = new double[6];

        notasAlunos[0] = 10.0;
        notasAlunos[1] = 7.0;
        notasAlunos[2] = 8.0;
        notasAlunos[3] = 7.5;
        notasAlunos[4] = 9.0;
        notasAlunos[5] = 6.5;

        System.out.println(Arrays.toString(notasAlunos));

        double result = 0.0;
        for(int i = 0; i <= 5; i++ ){
            result += notasAlunos[i];
            System.out.println(result);
        }
        System.out.println( "A media de notas da sala foi de " + result/notasAlunos.length);
    }

}
