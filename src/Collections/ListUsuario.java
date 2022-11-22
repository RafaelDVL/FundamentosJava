package Collections;

import java.util.Objects;

public class ListUsuario {
    String name;

    public ListUsuario(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "O nome do usuario é: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListUsuario that = (ListUsuario) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
