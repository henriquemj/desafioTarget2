import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Inicializa a sequência de Fibonacci
        int a = 0, b = 1;
        boolean pertence = (numero == a || numero == b);

        // Gera a sequência de Fibonacci e verifica se o número pertence
        while (b <= numero) {
            int proximo = a + b;
            a = b;
            b = proximo;

            if (b == numero) {
                pertence = true;
                break;
            }
        }

        // Resultado
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}