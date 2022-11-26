package composição;

public class Carro{

    Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void  acelerar(){
        motor.fatorInjecao += 0.4;
    }

    void frear(){
        motor.fatorInjecao -= 0.4;
    }

    void ligar(){
        motor.status = true;
    }
    void desligar(){
        motor.status = false;
    }

    String statusLigado(){

        if(motor.status){
            return "O carro esta ligado";
        } else {
            return "O carro esta desligado";
        }
    }
}
