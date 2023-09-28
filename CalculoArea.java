import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        a = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        b = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        c = scanner.nextDouble();

        scanner.close();
        CalcularArea(a,b,c);
    }

    public static void CalcularArea(double a, double b, double c) {

        System.out.println("A area do triangulo é: " + (a * c) / 2);
        System.out.println("A area do circulo é: " + Math.PI * (c * c));
        System.out.println("A area do trapézio é: " + ((a + b) * c) / 2);
        System.out.println("A area do quadrado é: " + b * b);
        System.out.println("A area do retângulo é: " + a * b);
    }
}
