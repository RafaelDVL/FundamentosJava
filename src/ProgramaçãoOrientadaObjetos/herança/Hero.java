package ProgramaçãoOrientadaObjetos.herança;

public class Hero extends Jogador{

    @Override
    boolean atacar(Jogador oponente) {
         super.atacar(oponente);
         super.atacar(oponente);

         return true;
    }
}
