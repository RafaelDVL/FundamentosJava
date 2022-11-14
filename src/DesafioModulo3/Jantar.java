package DesafioModulo3;

public class Jantar {
    public static void main(String[] args) {

        Comida comida1 = new Comida("Bife", 0.500);
        Comida comida2 = new Comida("Batata", 0.700);
        Comida comida3 = new Comida("Salada", 0.200);


        Pessoa pessoa1 = new Pessoa("Rafael", 82.0);
        Pessoa pessoa2 = new Pessoa("Marcelo", 70.0);
        Pessoa pessoa3 = new Pessoa("Eduardo", 72.0);

        pessoa1.comer(comida1);

    }
}
