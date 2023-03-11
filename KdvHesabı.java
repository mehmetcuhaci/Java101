package Pratikler;
import java.util.Scanner;
public class KdvHesabı {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double tutar,kdvoran=0.18,kdvtutar,kdvlitutar;

        System.out.println("Para miktarı giriniz:");
        tutar= input.nextDouble();

        kdvoran = (tutar>0) && (tutar<=1000) ? 0.18 : 0.08;

        kdvtutar=tutar*kdvoran;
        kdvlitutar=tutar+kdvtutar;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV oranı: "+ kdvoran);
        System.out.println("KDV tutarı: "+ kdvtutar);
        System.out.println("KDV'li tutarı: "+kdvlitutar);




    }
}
