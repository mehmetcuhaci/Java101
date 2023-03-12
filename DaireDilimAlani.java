package Pratikler;
import java.util.Scanner;
public class DaireDilimAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14,alan,r;
        int a;

        System.out.print("Yarıçap giriniz: ");
        r= input.nextDouble();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a= input.nextInt();

        alan=(pi*(r*r)*a)/360;

        System.out.println("Alanı: "+ alan);





    }
}
