package q3;

import java.util.Scanner;

public class questão3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean prim = true;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores: ");
        for (i = 0; i < 10; i++) {
            int x = scanner.nextInt();
            vetor[i] = x;
        }
        System.out.println();
        System.out.println();
        System.out.println("Os valores digitados foram:");
        for (i = 0; i < 10; i++) {
            System.out.print(vetor[i] + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Os valores primos são:");
        for (i = 0; i < 10; i++) {
            prim = true;
            for (int j = 2; j < vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    prim = false;
                }
            }
            if (vetor[i] == 1) {
                prim = false;
            }
            if (prim == true) {
                System.out.print(vetor[i] + "  ");
            }
        }
    }
}