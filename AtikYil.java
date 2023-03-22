package Pratikler;

import java.util.Scanner;

public class AtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int date;

        System.out.print("Yıl giriniz: ");
        date = input.nextInt();

        if ((date % 4 == 0) && (date % 100 != 0) || (date % 400 == 0)) {
            System.out.println(date + " bir atık yıldır.");
        } else {
            System.out.println(date + " bir atık yıl değildir.");
        }


    }
}
