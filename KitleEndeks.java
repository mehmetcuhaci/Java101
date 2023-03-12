package Pratikler;
import java.util.Scanner;
public class KitleEndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,endeks,kilo;

        System.out.print("Kilonuzu giriniz: ");
        kilo=input.nextDouble();

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();

        endeks=kilo/(boy*boy);

        System.out.println("Vücud Kütle Endeksiniz: "+endeks);

    }
}
