package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String > usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // Put não so acrescenta como tbm substitui.
        usuarios.put(2, "Junior");
        usuarios.put(3, "Godofredo");
        usuarios.put(4, "Juvenal");
        usuarios.put(5, "Pereira");

        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Juvenal"));
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());


        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));

        for (Integer chave: usuarios.keySet()
             ) {
            System.out.println(chave);

        }
        for (String name: usuarios.values()
             ) {
            System.out.println(name);
        }
        for (Map.Entry inteiro: usuarios.entrySet()
             ) {
            System.out.println(inteiro);
        }

    }
}
