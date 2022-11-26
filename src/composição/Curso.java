package composição;

import java.util.ArrayList;

public class Curso {

    final String nomeCurso;

    final ArrayList<Aluno> listaAlunos = new ArrayList<>();

    Curso(String curso){
        this.nomeCurso = curso;
    }

    void adicionarAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
        aluno.cursos.add(this);
    }


}
