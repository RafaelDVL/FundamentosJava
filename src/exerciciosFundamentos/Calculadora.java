package exerciciosFundamentos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero:");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação desejada:");
        String operator = entrada.next();

        double result = "+".equals(operator) ? num1 + num2 : 0;
        result = "-".equals(operator) ? num1 - num2 : result;
        result = "*".equals(operator) ? num1 * num2 : result;
        result = "/".equals(operator) ? num1 / num2 : result;

        System.out.printf(" %f %s %f = %f", num1, operator, num2, result);
        entrada.close();
    }
}
