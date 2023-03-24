package Pratikler;
import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("İlk Kenarı Giriniz: ");
        a= input.nextInt();;
        System.out.print("İkinici Kenarı Giriniz: ");
        b= input.nextInt();

        c=Math.sqrt((a*a)+(b*b)); //Math.sqrt karekök almamızı sağlayan sınıf.
        System.out.println("Hipotenüs: "+c);






    }
}
