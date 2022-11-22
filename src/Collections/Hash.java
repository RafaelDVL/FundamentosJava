package Collections;

import EqualseHashcode.Usuario;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        HashSet<ListUsuario> usuarios = new HashSet<ListUsuario>();

        usuarios.add(new ListUsuario("Pedro"));
        usuarios.add(new ListUsuario("Ana"));
        usuarios.add(new ListUsuario("Guilherme"));

        boolean resultado = usuarios.contains(new ListUsuario("Guilherme"));
        System.out.println(resultado);
    }
}
