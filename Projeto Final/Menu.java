// Menu.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();

        do {
            System.out.println("MENU:");
            System.out.println("1-Gerenciar ALUNOS");
            System.out.println("2-Gerenciar PROFESSORES");
            System.out.println("3-Gerenciar DISCIPLINAS");
            System.out.println("4-Gerenciar CURSOS");
            System.out.println("5-SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Lógica para gerenciar alunos
                    gerenciarAlunos(alunos);
                    break;
                case 2:
                    // Lógica para gerenciar professores
                    gerenciarProfessores(professores);
                    break;
                case 3:
                    // Lógica para gerenciar disciplinas
                    gerenciarDisciplinas(disciplinas, professores);
                    break;
                case 4:
                    // Lógica para gerenciar cursos
                    gerenciarCursos(cursos, disciplinas, alunos);
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);
    }

    private static void gerenciarAlunos(List<Aluno> alunos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Cadastrar aluno");
        System.out.println("2-Listar alunos");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.next();
                System.out.print("Digite a idade do aluno: ");
                int idade = scanner.nextInt();
                System.out.print("Digite a matrícula do aluno: ");
                String matricula = scanner.next();

                Aluno aluno = new Aluno(nome, idade, matricula);
                alunos.add(aluno);

                System.out.println("Aluno cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Lista de alunos:");
                for (Aluno a : alunos) {
                    System.out.println(a.nome + " - " + a.matricula);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void gerenciarProfessores(List<Professor> professores) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("1-Cadastrar professor");
        System.out.println("2-Listar professores");
    
        int escolha = scanner.nextInt();
    
        switch (escolha) {
            case 1:
                System.out.print("Digite o nome do professor: ");
                String nome = scanner.next();
                System.out.print("Digite a idade do professor: ");
                int idade = scanner.nextInt();
                System.out.print("Digite a disciplina que o professor leciona: ");
                String disciplina = scanner.next();
    
                Professor professor = new Professor(nome, idade, disciplina);
                professores.add(professor);
    
                System.out.println("Professor cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Lista de professores:");
                for (Professor p : professores) {
                    System.out.println(p.nome + " - Leciona: " + p.disciplina);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    
    private static void gerenciarDisciplinas(List<Disciplina> disciplinas, List<Professor> professores) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("1-Cadastrar disciplina");
        System.out.println("2-Listar disciplinas");
    
        int escolha = scanner.nextInt();
    
        switch (escolha) {
            case 1:
                System.out.print("Digite o nome da disciplina: ");
                String nomeDisciplina = scanner.next();
                System.out.print("Escolha um professor para a disciplina (Digite o índice do professor):");
                listarProfessores(professores);
                int indiceProfessor = scanner.nextInt();
    
                if (indiceProfessor >= 0 && indiceProfessor < professores.size()) {
                    Disciplina disciplina = new Disciplina(nomeDisciplina, professores.get(indiceProfessor));
                    disciplinas.add(disciplina);
    
                    System.out.println("Disciplina cadastrada com sucesso!");
                } else {
                    System.out.println("Índice de professor inválido.");
                }
                break;
            case 2:
                System.out.println("Lista de disciplinas:");
                for (Disciplina d : disciplinas) {
                    System.out.println(d.nome + " - Professor: " + d.professor.nome);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    
    private static void gerenciarCursos(List<Curso> cursos, List<Disciplina> disciplinas, List<Aluno> alunos) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("1-Cadastrar curso");
        System.out.println("2-Listar cursos");
    
        int escolha = scanner.nextInt();
    
        switch (escolha) {
            case 1:
                System.out.print("Digite o nome do curso: ");
                String nomeCurso = scanner.next();
                System.out.print("Escolha disciplinas para o curso (Digite os índices das disciplinas separados por vírgula): ");
                listarDisciplinas(disciplinas);
                String indicesDisciplinas = scanner.next();
                String[] indicesArray = indicesDisciplinas.split(",");
    
                List<Disciplina> disciplinasCurso = new ArrayList<>();
                for (String indice : indicesArray) {
                    int indiceDisciplina = Integer.parseInt(indice.trim());
                    if (indiceDisciplina >= 0 && indiceDisciplina < disciplinas.size()) {
                        disciplinasCurso.add(disciplinas.get(indiceDisciplina));
                    } else {
                        System.out.println("Índice de disciplina inválido.");
                    }
                }
    
                System.out.print("Escolha alunos para o curso (Digite os índices dos alunos separados por vírgula): ");
                listarAlunos(alunos);
                String indicesAlunos = scanner.next();
                String[] indicesAlunosArray = indicesAlunos.split(",");
    
                List<Aluno> alunosCurso = new ArrayList<>();
                for (String indice : indicesAlunosArray) {
                    int indiceAluno = Integer.parseInt(indice.trim());
                    if (indiceAluno >= 0 && indiceAluno < alunos.size()) {
                        alunosCurso.add(alunos.get(indiceAluno));
                    } else {
                        System.out.println("Índice de aluno inválido.");
                    }
                }
    
                Curso curso = new Curso(nomeCurso, disciplinasCurso, alunosCurso);
                cursos.add(curso);
    
                System.out.println("Curso cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Lista de cursos:");
                for (int i = 0; i < cursos.size(); i++) {
                    Curso c = cursos.get(i);
                    System.out.println(i + " - " + c.nome);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    
    private static void listarProfessores(List<Professor> professores) {
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(i + " - " + professores.get(i).nome);
        }
    }
    
    private static void listarDisciplinas(List<Disciplina> disciplinas) {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(i + " - " + disciplinas.get(i).nome);
        }
    }
    
    private static void listarAlunos(List<Aluno> alunos) {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + " - " + alunos.get(i).nome);
        }
    }
    

}
