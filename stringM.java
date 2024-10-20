import java.util.Scanner;

public class ContarA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int contador = 0;

        // Converte a string para minúsculas para facilitar a contagem
        String entradaMinuscula = entrada.toLowerCase();

        // Conta quantas vezes 'a' aparece
        for (char c : entradaMinuscula.toCharArray()) {
            if (c == 'a') {
                contador++;
            }
        }

        // Verifica se a letra 'a' existe e imprime os resultados
        if (contador > 0) {
            System.out.println("A letra 'a' (ou 'A') foi encontrada " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'a' (ou 'A') não foi encontrada.");
        }

        scanner.close();
    }
}