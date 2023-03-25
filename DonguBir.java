package Pratikler;

import java.util.Scanner;

public class DonguBir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inp, top = 0, num = 0;
        double ort;

        System.out.print("Sayı Giriniz:");
        inp = input.nextInt();

        for (int i = 0; i < inp; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                top += i;
                num++;
            }
        }
        ort = top / num;
        System.out.println("Sayıların Ortalaması "+ort);
    }
}
