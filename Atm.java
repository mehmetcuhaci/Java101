package Pratikler;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        String userName, password;
        int select, balance = 1500;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, MAC Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme" +
                            "\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Lütfen yatırmak istediğiniz miktarı girin: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Lütfen çekmek istediğiniz miktarı girin: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz!");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Görüşmek üzere!");
                break;
            } else {
                right--;

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçiniz!");
                } else {
                    System.out.println("Hatalı giriş yaptınız tekrar deneyiniz!");
                    System.out.println("Kalan deneme hakkınız: " + right);
                }

            }


        }


    }
}
