package Pratikler;

import java.util.Scanner;

public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, digitNumber = 0;
        int digitValue, digitPow;
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        int tempNumber = number;
        int result = 0;


        while (tempNumber != 0) {  //kullanıcıdan aldığımız sayıyı 10'a bölüp basamak sayısını buluyoruz.
            tempNumber /= 10;
            digitNumber++;
        }
        tempNumber = number;   //geçici sayımızı yeniden aldığımız sayıya eşitliyoruz çünkü yukarıdaki döngüde 0 oldu.
        while (tempNumber != 0) {

            digitValue = tempNumber % 10; //burada basamağın değerini mod alma ile buluyoruz 2451%10=1 olacağı için 1 olur mesela
            digitPow = 1;  //üssü 1 e eşitledik
            for (int i = 1; i <= digitNumber; i++) {
                digitPow *= digitValue; //burada basamağın değerini basamak sayısıyla üssünü aldık.
            }
            result += digitPow; //her döngüde armstrong sayısını bulmak için topluyoruz.
            tempNumber /= 10;  //döngü başa dönüceği için yeniden 10'a bölmemiz lazım

        }
        if (result == number) {
            System.out.println(number + " Sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " Sayısı bir Armstrong sayı değildir.");
        }


    }

}
