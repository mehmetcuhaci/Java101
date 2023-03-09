package Pratikler;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fzk,kmy,trk,mzk,trh, toplam;
        double ort;
        

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notu Giriniz:");
        mat= input.nextInt();

        System.out.print("Fizik Notu Giriniz:");
        fzk= input.nextInt();

        System.out.print("Kimya Notu Giriniz:");
        kmy= input.nextInt();

        System.out.print("Türkçe Notu Giriniz:");
        trk= input.nextInt();

        System.out.print("Müzik Notu Giriniz:");
        mzk= input.nextInt();

        System.out.print("Tarih Notu Giriniz:");
        trh= input.nextInt();

        toplam=(mat+fzk+kmy+trk+mzk+trh);
        ort=toplam/6;


        System.out.println("Ortalamanız " +ort);

        System.out.println(ort>=60.0 ? "Sınıfı Geçti!":"Sınıfta Kaldı!");













    }
}
