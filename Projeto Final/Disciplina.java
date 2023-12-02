public class Disciplina {
    String nome;
    Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }
    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void mostrarDetalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Disciplina: ").append(nome).append("\n");
        detalhes.append("Professor: ").append(professor.nome).append("\n");
    
        System.out.println(detalhes.toString());
    }
}