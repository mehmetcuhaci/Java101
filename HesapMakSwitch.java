package Pratikler;

import java.util.Scanner;

public class HesapMakSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                switch (n2) {
                    case 0:
                        System.out.println("Bir Sayı 0'a Bölünemez!!");
                        break;
                    default:
                        System.out.println("Bölüm: " + (n1 / n2));
                        break;
                }
                break;
            case 4:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            default:
                System.out.println("Yanlış Değer Girdiniz Tekrar Deneyiniz.");

        }


    }
}
