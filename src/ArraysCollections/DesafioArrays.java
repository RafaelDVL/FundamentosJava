package ArraysCollections;

import java.util.Scanner;

public class DesafioArrays {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que irão ser digitadas:");
        int quantitation = userinput.nextInt();

        double conjNotas[] = new double[quantitation];

        for(int i = 0; i < conjNotas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ":");
            conjNotas[i] = userinput.nextDouble();
            System.out.println("Ok a nota digitada foi " + conjNotas[i]);
        }
        double somatotal = 0.0;
        for(double nota: conjNotas){
            somatotal += nota;
        }

        System.out.println("A soma de todas as notas do aluno foi de " + somatotal);
        System.out.println("A soma de todas as notas do aluno foi de " + somatotal/quantitation);

    }
}
