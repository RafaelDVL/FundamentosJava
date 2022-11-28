package ProgramaçãoOrientadaObjetos.herança.desafioheranca;

public class Carro {

    double velocidadeatual = 0;

    int aceler;

    double velocidademax;

    void acelerar(){

        if(velocidadeatual < (velocidademax-aceler)){
            velocidadeatual += aceler;
        } else {
            velocidadeatual = velocidademax;
            System.out.println("O carro alcançou a velocidade limite de " + velocidademax + " KM/h, não sera possivel acelerar mais que isso!!!");
        }

    }

    void frear(){

        if(velocidadeatual <= 0){
            System.out.println("O carro esta parado, portanto nao existe a necessidade de frear!!!");
        } else {
            this.velocidadeatual -=10;
        }

    }
}
