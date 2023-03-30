package Pratikler;

import java.util.Scanner;

public class AtmWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance = 1500, right = 3, select, price;


        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, MAC Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.print("Lütfen Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Çekilecek miktarı giriniz: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Çekilecek miktar bakiyenizden fazla olamaz!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 2:
                            System.out.print("Yatıralacak miktarı giriniz: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapıldı!");
                    }
                } while (select != 4);
                System.out.println("Yeniden görüşmek üzere!");
                break;

            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı giriş tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: " + right);
                }

            }


        }


    }
}
