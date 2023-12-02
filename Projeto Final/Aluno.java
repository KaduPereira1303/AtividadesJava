public class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    // Implementação do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Sou um aluno chamado " + nome + " e minha matrícula é " + matricula);
    }
}