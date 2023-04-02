package Pratikler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int adet = input.nextInt();
        int num, i = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (i <= adet) {
            System.out.print(i + ". sayıyı giriniz : ");
            num = input.nextInt();

            if (num < min) {
                min = num;
            } else {
                max = num;
            }
            i++;
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);


    }
}
