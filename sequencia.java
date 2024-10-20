import java.util.Scanner;

public class Sequencias {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___
        int a = 1;
        System.out.println("Próximo elemento da sequência a): " + (a + 8)); // 9

        // b) 2, 4, 8, 16, 32, 64, ____
        int b = 64;
        System.out.println("Próximo elemento da sequência b): " + (b * 2)); // 128

        // c) 0, 1, 4, 9, 16, 25, 36, ____
        int c = 6;
        System.out.println("Próximo elemento da sequência c): " + (c * c)); // 49

        // d) 4, 16, 36, 64, ____
        int d = 10;
        System.out.println("Próximo elemento da sequência d): " + (d * d)); // 100

        // e) 1, 1, 2, 3, 5, 8, ____
        int e1 = 5, e2 = 8;
        System.out.println("Próximo elemento da sequência e): " + (e1 + e2)); // 13

        // f) 2, 10, 12, 16, 17, 18, 19, ____
        int f = 19;
        System.out.println("Próximo elemento da sequência f): " + (f + 1)); // 20
    }
}