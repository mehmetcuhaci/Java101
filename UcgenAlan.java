package Pratikler;

import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c;
        double alan,u;
        Scanner input= new Scanner(System.in);

        System.out.println("Üçgenin Kenar Uzunluklarını Giriniz:");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: "+ alan);








    }
}
