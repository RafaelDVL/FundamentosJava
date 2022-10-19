package CalculatorQuadradoCubico;

import java.util.Scanner;

public class CalculatorQuadradoCubico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double numuser = scanner.nextDouble();

        double resultQ = Math.pow(numuser, 2);
        double resultC = Math.pow(numuser, 3);

        System.out.printf("O valor quadrado do numero %f é de : %.1f  e o valor cubico é de : %.1f.", numuser,resultQ, resultC);
    }
}
