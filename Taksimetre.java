package Pratikler;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int km;
        double perkm=2.20,tutar,baslangic=10;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km= input.nextInt();

        tutar=(km*perkm);
        tutar+=baslangic;

        tutar=(tutar<20) ? 20:tutar;

        System.out.println("Toplam Tutar: "+ tutar);






    }
}
