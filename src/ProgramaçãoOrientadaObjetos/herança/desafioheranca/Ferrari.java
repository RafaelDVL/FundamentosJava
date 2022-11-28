package ProgramaçãoOrientadaObjetos.herança.desafioheranca;

public class Ferrari extends Carro{



    Ferrari(){
        this.velocidademax = 250;
        this.aceler = 40;
    }

    @Override
    void acelerar() {
        super.acelerar();
    }

    @Override
    void frear() {
        if(velocidadeatual <= 50){
            System.out.println("O carro esta parado, portanto nao existe a necessidade de frear!!!");
            velocidadeatual = 0;
        } else {
            this.velocidadeatual -=50;
        }
    }
}
