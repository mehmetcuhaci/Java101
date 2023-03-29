package Pratikler;

import java.util.Scanner;

public class DersGecmeKosullu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, f, t, mzk, k, num = 5;

        System.out.print("Matematik Notu Giriniz: ");
        m = input.nextInt();
        if (m < 0 || m > 100) {
            m = 0;
            num--;
        }

        System.out.print("Fizik Notu Giriniz: ");
        f = input.nextInt();
        if (f < 0 || f > 100) {
            f = 0;
            num--;
        }

        System.out.print("Türkçe Notu Giriniz: ");
        t = input.nextInt();
        if (t < 0 || t > 100) {
            t = 0;
            num--;
        }

        System.out.print("Müzik Notu Giriniz: ");
        mzk = input.nextInt();
        if (mzk < 0 || mzk > 100) {
            mzk = 0;
            num--;
        }

        System.out.print("Kimya Notu Giriniz: ");
        k = input.nextInt();
        if (k < 0 || k > 100) {
            k = 0;
            num--;
        }

        double avarage = (m + t + f + mzk + k) / num;
        if (avarage > 55) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız!");
        }
        System.out.println("Ortalamanız: " + avarage);


    }
}
