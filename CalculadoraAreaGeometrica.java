import java.util.Scanner;

public class CalculadoraAreaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Áreas de Formas Geométricas");
        System.out.println("Escolha a forma geométrica:");
        System.out.println("1 - Triângulo Retângulo");
        System.out.println("2 - Círculo");
        System.out.println("3 - Trapézio");
        System.out.println("4 - Quadrado");
        System.out.println("5 - Retângulo");
        System.out.print("Digite o número da forma desejada: ");
        
        int escolha = scanner.nextInt();
        
        double area = 0;
        
        switch (escolha) {
            case 1:
                System.out.print("Digite o valor da base (A): ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Digite o valor da altura (C): ");
                double alturaTriangulo = scanner.nextDouble();
                area = (baseTriangulo * alturaTriangulo) / 2;
                break;
            case 2:
                System.out.print("Digite o valor do raio (C): ");
                double raioCirculo = scanner.nextDouble();
                area = 3.14159 * raioCirculo * raioCirculo;
                break;
            case 3:
                System.out.print("Digite o valor da base maior (A): ");
                double baseMaiorTrapezio = scanner.nextDouble();
                System.out.print("Digite o valor da base menor (B): ");
                double baseMenorTrapezio = scanner.nextDouble();
                System.out.print("Digite o valor da altura (C): ");
                double alturaTrapezio = scanner.nextDouble();
                area = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio) / 2;
                break;
            case 4:
                System.out.print("Digite o valor do lado (B): ");
                double ladoQuadrado = scanner.nextDouble();
                area = ladoQuadrado * ladoQuadrado;
                break;
            case 5:
                System.out.print("Digite o valor do lado A: ");
                double ladoA = scanner.nextDouble();
                System.out.print("Digite o valor do lado B: ");
                double ladoB = scanner.nextDouble();
                area = ladoA * ladoB;
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        if (area > 0) {
            System.out.printf("A área da forma geométrica escolhida é: %.2f\n", area);
        }
        
        scanner.close();
    }
}
