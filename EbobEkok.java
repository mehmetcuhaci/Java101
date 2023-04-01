package Pratikler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("n1 sayısını girin: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını girin: ");
        n2 = input.nextInt();
        int ebob = 1;

        //EBOB

        for (int i=1;i<=n1;i++){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
        }

        System.out.println(ebob);
        System.out.println("====================================================");

        //EKOK

        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
        }

              //Ekok formülüde EKOK=(n1*n2)/EBOB
    }
}
