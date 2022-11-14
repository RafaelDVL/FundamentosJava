package DesafioModulo3;

public class Pessoa {

    String nome;
    Double peso;

    Pessoa(String nomepessoa, Double pesopessoa){
        nome = nomepessoa;
        peso = pesopessoa;
    }

    public void comer(Comida comidaEscolhida){
        peso += comidaEscolhida.pesoComida;
        System.out.println("O Peso da pessoa atualziado é: " + peso);
    }
}
