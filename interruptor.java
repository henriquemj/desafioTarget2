import java.util.Scanner;

public class InterruptoresELampadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulando o estado das lâmpadas (1: acesa, 0: apagada)
        int[] lampadas = {0, 0, 0}; // Todas apagadas inicialmente

        // Ligar o primeiro interruptor
        System.out.println("Ligue o primeiro interruptor e aguarde 10-15 minutos.");
        lampadas[0] = 1; // Lâmpada 1 acesa

        // Simular o tempo de espera
        System.out.println("Desligando o primeiro interruptor e ligando o segundo.");
        lampadas[0] = 0; // Lâmpada 1 apagada
        lampadas[1] = 1; // Lâmpada 2 acesa

        // Simulando a ida às salas para verificar lâmpadas
        System.out.println("Vá até as salas das lâmpadas e verifique o estado delas.");

        // Perguntar ao usuário sobre o estado das lâmpadas
        System.out.print("A lâmpada 1 está acesa ou apagada? (1 para acesa, 0 para apagada): ");
        int estadoLampada1 = scanner.nextInt();
        System.out.print("A lâmpada 2 está acesa ou apagada? (1 para acesa, 0 para apagada): ");
        int estadoLampada2 = scanner.nextInt();
        System.out.print("A lâmpada 3 está acesa ou apagada? (1 para acesa, 0 para apagada): ");
        int estadoLampada3 = scanner.nextInt();

        // Identificação das lâmpadas
        if (estadoLampada1 == 1) {
            System.out.println("A lâmpada 1 é controlada pelo segundo interruptor.");
        } else if (estadoLampada1 == 0) {
            System.out.println("A lâmpada 1 é controlada pelo terceiro interruptor.");
        }

        if (estadoLampada2 == 1) {
            System.out.println("A lâmpada 2 é controlada pelo segundo interruptor.");
        } else if (estadoLampada2 == 0) {
            System.out.println("A lâmpada 2 é controlada pelo terceiro interruptor.");
        }

        if (estadoLampada3 == 1) {
            System.out.println("A lâmpada 3 é controlada pelo segundo interruptor.");
        } else if (estadoLampada3 == 0) {
            System.out.println("A lâmpada 3 é controlada pelo terceiro interruptor.");
        }

        scanner.close();
    }
}
