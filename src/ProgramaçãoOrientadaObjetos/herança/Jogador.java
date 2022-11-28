package ProgramaçãoOrientadaObjetos.herança;

public class Jogador {

    int vida = 100;
    int x;
    int y;

    boolean andar(Direcao direcao){

        switch (direcao){
            case NORTE:{
                this.y += 1;
                break;
            }case SUL:{
                this.y -= 1;
                break;
            }case LESTE:{
                this.x += 1;
                break;
            }case OESTE:{
                this.x -= 1;
                break;
            }
        }
        return true;
    }

    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }
}
