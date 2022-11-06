package estruturasderepeticao;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota:");
        double nota = entrada.nextDouble();

        if(nota <= 5){
            System.out.println("O aluno foi reprovado, nota insuficiente!");
        } else if (nota >5 && nota <=7){
            System.out.println("O aluno foi aprovado, nota suficiente");
        } else {
            System.out.println("O aluno foi aprovado, parabens pela excelente nota");
        }

        entrada.close();
    }
}
