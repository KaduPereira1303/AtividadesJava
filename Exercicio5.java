import java.util.Scanner;

class Funcionario {
    private int numero;
    private double horasTrabalhadas;
    private double valorPorHora;
    
    public Funcionario(int numero, double horasTrabalhadas, double valorPorHora) {
        this.numero = numero;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
    
    public int getNumero() {
        return numero;
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        Funcionario funcionario = new Funcionario(numeroFuncionario, horasTrabalhadas, valorPorHora);
        
        System.out.printf("Número do funcionário: %d\n", funcionario.getNumero());
        System.out.printf("Salário do funcionário: %.2f\n", funcionario.calcularSalario());
        
        scanner.close();
    }
}
