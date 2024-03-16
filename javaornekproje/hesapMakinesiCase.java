package javaornekproje;

import java.util.Scanner;

public class hesapMakinesiCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sayi1,sayi2,sonuc;
        System.out.println("1.Sayıyı giriniz : ");
        sayi1=scan.nextDouble();
        System.out.println("2.Sayıyı giriniz : ");
        sayi2=scan.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçin : +,-,*,/");
        char operator=scan.next().charAt(0);

        switch (operator){
            case '+':
                sonuc = sayi1+sayi2;
                System.out.println("cevap :"+sonuc);
                break;
            case '-':
                sonuc= sayi1-sayi2;
                System.out.println("cevap :"+sonuc);
                break;
            case '*':
                sonuc = sayi1*sayi2;
                System.out.println("cevap :"+sonuc);
                break;
            case  '/':
                sonuc = sayi1/sayi2;
                System.out.println("cevap :"+sonuc);
                break;
        }
    }
}
