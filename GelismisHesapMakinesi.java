package Pratikler;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım: " + result);
        return result;
    }

    static int diveded(int a, int b) {

        if (b == 0) {
            System.out.println("Bir sayı 0'a bölünemez!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }
        System.out.println(a + "'nın " + b + " Üssü " + result);
        return result;
    }

    static int fac(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuç " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuç " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi " + (2 * (a + b)));
        System.out.println("Alanı " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk sayı: ");
            int a = input.nextInt();
            System.out.print("İkinci sayı: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    diveded(a, b);
                    break;
                case 5:
                    pow(a, b);
                    break;
                case 6:
                    fac(a);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    calc(a, b);
                    break;

                default:
                    System.out.println("Lütfen geçerli bir değer giriniz.");
            }


        }
        System.out.println("Güle Güle!");


    }
}
