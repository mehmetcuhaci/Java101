package Pratikler;

import java.util.Scanner;
public class Dongu3 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        num= input.nextInt();

        for (int i=1,j=1;i<=num && j<=num;i*=4,j*=5){
            System.out.println(i+"\n"+j);



        }



    }
}
