package Pratikler;

import java.util.Scanner;
public class AsalSayiRecursive {
    static boolean isPrime(int n, int i) {
        //Base cases
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        //Recursive case
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number, 2)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }
}
