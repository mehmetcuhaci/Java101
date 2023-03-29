package Pratikler;

import java.util.Scanner;

public class YildizYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) { //girdiği n sayısı kadar boşluk yazdırıcak
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {//döngü her döndüğünde i'nin 2katının 1 eksiği kadar yıldız yazdır.
                System.out.print("*");
            }

            System.out.println(); //her döngüde alt satıra inmesi için boşluk bırakmamız lazım


        }


    }
}
