import java.util.Scanner;

public class CalculoSoma {
    public static void main(String[] args) {
        int a;
        int b;
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        a = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        b = scanner.nextInt();

        int soma = a + b;
      
        scanner.close();
        System.out.println("A soma dos numeros é: " + soma);
        
    }

    
}
