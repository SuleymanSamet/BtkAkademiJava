package ınterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = scanner.nextDouble();

        System.out.print("Kart no giriniz : ");
        String cardNumber = scanner.next();

        System.out.print("Son kullanım tarihi : ");
        String expiryDate=scanner.next();

        System.out.print("Kart güvenlik kodu : ");
        String cvc=scanner.next();

        System.out.println("1- A Bankası");
        System.out.println("2- B Bankası");
        System.out.println("3- C Bankası");
        System.out.print("Banka Seçiniz : ");
        int selectBank = scanner.nextInt();

        switch (selectBank){
            case 1:
                Abankasi aPost=new Abankasi("A Bankası","45121114","121215163");
                aPost.connect("127.1.1.1");
                aPost.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 2:
                Bbanksi bPost=new Bbanksi("B Bankası","31621114","121005163");
                bPost.connect("127.1.0.1");
                bPost.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 3:
                Cbankasi cPost=new Cbankasi("C Bankası","31612112","131005063");
                cPost.connect("127.6.0.1");
                cPost.payment(price,cardNumber,expiryDate,cvc);
                break;

            default:
                System.out.println("Geçerli banka giriniz !!!");
        }


    }
}
