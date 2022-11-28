package ProgramaçãoOrientadaObjetos.herança;

public class Jogo {
    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.x = 10;
        monster.y= 10;

        Hero hero = new Hero();
        hero.x = 10;
        hero.y= 11;

        System.out.println("Vida do monstro +> " + monster.vida);
        System.out.println("Vida do heroi +> " + hero.vida);


        monster.atacar(hero);
        monster.atacar(hero);
        hero.atacar(monster);
        hero.atacar(monster);
        hero.atacar(monster);

        System.out.println("Vida do monstro +> " + monster.vida);
        System.out.println("Vida do heroi +> " + hero.vida);







    }
}
