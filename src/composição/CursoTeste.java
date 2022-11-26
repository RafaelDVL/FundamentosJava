package composição;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael");
        Aluno aluno2 = new Aluno("João");
        Aluno aluno3 = new Aluno("Bruna");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Spring");
        Curso curso3 = new Curso("Angular");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for ( Aluno aluno: curso1.listaAlunos
             ) {
            System.out.println("Aluno matriculado no curso: " + curso1.nomeCurso + " - " + aluno.nome);
        }

        for ( Aluno aluno: curso3.listaAlunos
        ) {
            System.out.println("Aluno matriculado no curso: " + curso3.nomeCurso + " - " + aluno.nome);
        }

        for ( Aluno aluno: curso2.listaAlunos
        ) {
            System.out.println("Aluno matriculado no curso: " + curso2.nomeCurso + " - " + aluno.nome);
        }

        System.out.println(aluno1.cursos.get(0).listaAlunos);

        Curso cursoEncontrado = aluno2.obterCursoPorNome("Spring");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.listaAlunos);
        } else {
            System.out.println("O aluno não foi encontrado nesse curso...");
        }


    }



}
