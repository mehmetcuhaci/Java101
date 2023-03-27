package Pratikler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kombinasyon yapılacak sayıları giriniz: ");
        int n = input.nextInt(), r = input.nextInt(), total = 1;
        int xF = 1, nF = 1, rF = 1;
        int x = n - r, comb;

        for (int i = 1; i <= n; i++) {
            nF *= i;
        }
        for (int j = 1; j <= r; j++) {
            rF *= j;
        }
        for (int k = 1; k <= x; k++) {
            xF *= k;
        }
        comb = nF / (rF * xF);

        System.out.println(comb);


    }
}
