package javaornekproje;

import java.util.Scanner;

public class dörtVeBeş {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi=scan.nextInt();
        int sayac=0;
        int toplam=0;
        int ort;

        for (int i=0 ; i<sayi;i++){
            if (i % 4 == 0 && i % 5 == 0){
                System.out.println("4 ve 5 bölünen sayılar "+ i);
                sayac++;
                toplam+=i;
            }
            //sayac i
        }
        ort=toplam/sayac;
        System.out.println("4 ve 5'e bölünen sayıların sayısı: " + sayac);
        System.out.println("Toplam : "+toplam);
        System.out.println("Ortalaması : "+ort);


    }
}
