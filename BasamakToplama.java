package Pratikler;

import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, result = 0, digitValue;
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        int tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;

            result += digitValue;
            tempNumber /= 10;

        }
        System.out.println(number + " Sayısının basamaklarının toplamı: " + result);
    }

}
