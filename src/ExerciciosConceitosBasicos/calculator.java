package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor em Fahrenheit para conversão em Celsius:");
        double tempF = entrada.nextDouble();
        double resultC = ((tempF - 32)*5)/9;
        System.out.printf("A conversão do valor %f Fahrenheit para Celsius é de %.2f Celsius", tempF, resultC);

        System.out.println("Digite um valor em Celsius para conversão em Fahrenheit:");
        double tempC = entrada.nextDouble();
        double resultF = ((tempC * 9)/5)+32;
        System.out.printf("A conversão do valor %f Celsius para Fahrenheit é de %.2f Fahrenheit", tempC, resultF);
    }
}
