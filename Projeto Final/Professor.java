public class Professor extends Pessoa {
    String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    @Override
    public void apresentar() {
        System.out.println("Sou um professor chamado " + nome + " e leciono " + disciplina);
    }
}