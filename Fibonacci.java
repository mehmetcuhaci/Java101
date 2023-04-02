package Pratikler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int total,x=0,y=1;

        for (int i = 1; i < n; i++) {
            System.out.println(x);
            total=x+y;
            x=y;
            y=total;

        }


    }
}
