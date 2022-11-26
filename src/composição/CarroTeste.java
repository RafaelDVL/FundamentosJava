package composição;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.ligar();

        System.out.println(carro.statusLigado());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.motor.giros());


    }
}
