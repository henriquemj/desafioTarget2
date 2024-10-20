import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // Imprimindo o resultado
        System.out.println(SOMA);
    }
}
