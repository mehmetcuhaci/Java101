package Pratikler;

import java.util.Scanner;

public class Dongu2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum = 0;
        do {
            System.out.print("Bir sayı girin: ");
            num = input.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 != 1);

        System.out.println("Girilen sayılardan çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}


