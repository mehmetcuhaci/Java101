package Pratikler;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, i = 1;

        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        while (i <= n1) {
            i++;
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;

            }

        }
        System.out.println("EBOB: " + ebob);
        ekok = (n1 * n2) / ebob;

        System.out.println("EKOK: " + ekok);


    }
}
