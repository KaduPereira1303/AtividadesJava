import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        double salario = horasTrabalhadas * valorPorHora;
        
        System.out.printf("Número do funcionário: %d\n", numeroFuncionario);
        System.out.printf("Salário do funcionário: %.2f\n", salario);
        
        scanner.close();
    }
}
