package Pratikler;
import java.util.Scanner;
public class ManavHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a=2.14,e=3.67,d=1.11,m=0.95,p=5,tutar;
        double a1,e1,d1,m1,p1;

        System.out.print("Armut kaç kilo? ");
        a1= input.nextDouble()*a;

        System.out.print("Elma Kaç Kilo? ");
        e1= input.nextDouble()*e;

        System.out.print("Domates Kaç Kilo? ");
        d1= input.nextDouble()*d;

        System.out.print("Muz Kaç Kilo? ");
        m1= input.nextDouble()*m;

        System.out.print("Patlıcan Kaç Kilo? ");
        p1= input.nextDouble()*p;

        tutar=(a1+e1+d1+m1+p1);

        System.out.println("Toplam Tutar: "+tutar);








    }
}
