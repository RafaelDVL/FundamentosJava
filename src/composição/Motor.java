package composição;

public class Motor {

    Carro carro;
    double fatorInjecao = 1;
    boolean status = false;

    Motor(Carro car){
        this.carro = car;
    }

    int giros(){

        if(!status){
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }
}
