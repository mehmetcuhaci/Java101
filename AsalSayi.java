package Pratikler;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int n = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {

                    n++;
                }
            }
            if (n <= 2) {
                System.out.println(i);
            }
        }

    }
}

