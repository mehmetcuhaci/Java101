package Pratikler;

import java.util.Scanner;

public class SifreDegistirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, newPassword;
        int answer;


        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı!");

        } else if (userName.equals("patika") && !password.equals("java123")) {  //.equals eşitlik sınıfıdır string için
            System.out.println("Şifreniz hatalı değiştirmek için 1 veya 0 yazınız.");
            answer = input.nextInt();
            switch (answer) {
                case 0:
                    System.out.println("İşlem sonlandırıldı.");
                    break;
                case 1:
                    System.out.print("Yeni şifrenizi giriniz.");
                    newPassword = input.next();

                    if (newPassword.equals(password) || newPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    } else {
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                    break;
                default:
                    System.out.println("Hatalı değer girdiniz.");
            }

        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}
