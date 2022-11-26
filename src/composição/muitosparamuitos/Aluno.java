package composição.muitosparamuitos;

import java.util.ArrayList;

public class Aluno {
    String nome;
    ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome){

        for (Curso curso: this.cursos
             ) {
            if(curso.nomeCurso.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
