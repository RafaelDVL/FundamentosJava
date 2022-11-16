package ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos:");
        int qtyalunos = inputUser.nextInt();

        System.out.println("Digite a quantidade de notas por aluno:");
        int qtynotas = inputUser.nextInt();

        double[][] matrizAlunos = new double[qtyalunos][qtynotas];

        for (int i = 0; i < matrizAlunos.length; i++) {
            for (int j = 0; j < matrizAlunos[i].length; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", (j+1), (i+1));
                matrizAlunos[i][j] = inputUser.nextDouble();
            }
        }
        for (double[] notasAluno: matrizAlunos) {
            System.out.println(Arrays.toString(notasAluno));
        }


    }
}
