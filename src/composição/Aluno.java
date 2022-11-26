package composição;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {

    final String nome;

    final ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }


    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.listaAlunos.add(this);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }

    Curso obterCursoPorNome(String nome){
        for (Curso cursoE : this.cursos){
            if(cursoE.nomeCurso.equals(nome)){
                return cursoE;
            }
        }
        return null;
    }
}
