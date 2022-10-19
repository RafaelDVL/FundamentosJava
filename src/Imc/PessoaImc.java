package Imc;

import java.util.Scanner;
import java.lang.Math;

public class PessoaImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura (Metros):");
        double altura = entrada.nextDouble();
        System.out.println("Digite o seu peso (Kg):");
        double peso = entrada.nextDouble();

        double result = (peso/ Math.pow(altura, 2));

        System.out.printf("O valor de IMC para os dados fornecidos é de: %f", result);

    }
}
