import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] salarios = new double[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o número do funcionário " + (i+1) + ": ");
            int numeroFuncionario = scanner.nextInt();
            
            System.out.print("Digite o número de horas trabalhadas: ");
            double horasTrabalhadas = scanner.nextDouble();
            
            System.out.print("Digite o valor recebido por hora: ");
            double valorPorHora = scanner.nextDouble();
            
            double salario = horasTrabalhadas * valorPorHora;
            salarios[i] = salario;
            
            System.out.printf("Número do funcionário: %d\n", numeroFuncionario);
            System.out.printf("Salário do funcionário: %.2f\n", salario);
        }
        
        System.out.printf("Salário total dos funcionários: %.2f\n", salarios[0] + salarios[1]);
        
        scanner.close();
    }
}
