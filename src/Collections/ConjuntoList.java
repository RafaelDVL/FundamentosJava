package Collections;



import java.util.ArrayList;

public class ConjuntoList {

    public static void main(String[] args) {

        ArrayList<ListUsuario> listadeusuario = new ArrayList<>();

        ListUsuario user1 = new ListUsuario("RaphaelSmith");
        listadeusuario.add(user1);
        listadeusuario.add(new ListUsuario("MarceloPodrinho"));
        listadeusuario.add(new ListUsuario("Juvenal"));
        listadeusuario.add(new ListUsuario("Marquito"));
        listadeusuario.add(new ListUsuario("JesusCristo"));

        for (ListUsuario usuario : listadeusuario
        ) {
            System.out.println(usuario.name);
        }

        System.out.println(">>>>>>" + listadeusuario.size());

        System.out.println(listadeusuario.get(2));

        System.out.println(listadeusuario.remove(2));

        System.out.println(listadeusuario.contains(new ListUsuario("JesusCristo") ));

        for (ListUsuario usuario : listadeusuario
        ) {
            System.out.println(usuario.name);
        }

        System.out.println(listadeusuario.size());
    }
}
