import java.util.List;

public class Curso {
    String nome;
    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;

    public Curso(String nome, List<Disciplina> disciplinas, List<Aluno> alunos) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.alunos = alunos;
    }
    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void mostrarDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            disciplina.mostrarDetalhes();
        }
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            aluno.apresentar();
        }
    }
}