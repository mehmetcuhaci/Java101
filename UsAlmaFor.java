package Pratikler;

import java.util.Scanner;

public class UsAlmaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, total = 1;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= r; i++) {
            total *= n;
        }
        System.out.println("Sonuç: " + total);


    }


}
