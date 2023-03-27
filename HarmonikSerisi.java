package Pratikler;

import java.util.Scanner;

public class HarmonikSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        double result = 0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(n + " Sayısının Harmonik değeri: " + result);
    }
}
