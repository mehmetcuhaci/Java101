package Pratikler;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat > 5 && heat < 10) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("Sinema veya pikniğe gidebilirsin.");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Piknik yapabilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }


    }
}
