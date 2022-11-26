package composição.muitosparamuitos;

import java.util.ArrayList;

public class Curso {
    String nomeCurso;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }


}
