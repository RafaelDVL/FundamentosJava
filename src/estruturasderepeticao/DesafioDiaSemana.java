package estruturasderepeticao;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner diaDaSemana = new Scanner(System.in);

        System.out.println("Digite o dia da semana:");
        String dia = diaDaSemana.next();

        if(dia.toLowerCase().equals("segunda")){
            System.out.println("O numero correspondente ao dia é: 2");
        } else if(dia.toLowerCase().equals("terça")){
            System.out.println("O numero correspondente ao dia é: 3");
        } else if(dia.toLowerCase().equals("quarta")){
            System.out.println("O numero correspondente ao dia é: 4");
        } else if(dia.toLowerCase().equals("quinta")){
            System.out.println("O numero correspondente ao dia é: 5");
        } else if(dia.toLowerCase().equals("sexta")){
            System.out.println("O numero correspondente ao dia é: 6");
        } else if(dia.toLowerCase().equals("sabado")){
            System.out.println("O numero correspondente ao dia é: 7");
        } else {
            System.out.println("O numero correspondente ao dia é: 1");
        }
    }
}
