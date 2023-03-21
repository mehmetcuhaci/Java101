package Pratikler;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = 0.10, total, discount, typeDiscount;
        int age, type, distance;

        System.out.print("Gidilicek mesafeyi KM cinsinden giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini Tek Yön ise \"1\" Gidiş-Dönüş ise \"2\" Giriniz: ");
        type = input.nextInt();

        total = distance * km;


        if ((distance > 0) && (age > 0)) {

            if (age < 12) {
                discount = total * 0.5;
                total -= discount;
            } else if (age < 24) {
                discount = total * 0.1;
                total -= discount;
            } else if (age >= 65) {
                discount = total * 0.3;
                total -= discount;
            }
            switch (type) {
                case 1:
                    System.out.println("Toplam Tutar: " + total + "TL");
                    break;

                case 2:
                    typeDiscount = total * 0.2;
                    total = (total - typeDiscount) * 2;
                    System.out.println("Toplam Tutar: " + total + "TL");
                    break;

                default:
                    System.out.println("Hatalı veri girdiniz!");


            }


        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}
