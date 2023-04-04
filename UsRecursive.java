package Pratikler;

import java.util.Scanner;
public class UsRecursive {

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();
        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }

}
