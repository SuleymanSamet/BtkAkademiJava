package javaornekproje;

import java.util.Scanner;

public class otobüsFiyat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km,kmBasiUcret=0.10,toplam,indirim=0;
        int yas,secim;

        System.out.print("Gidilen km mesafesi :  ");
        km=scan.nextInt();

        toplam=km*kmBasiUcret;
        System.out.println("İndirimsiz Toplam tutar : "+toplam);

        System.out.print("Yaşınızı giriniz : ");
        yas=scan.nextInt();

        System.out.println("Yolculuk tipini seçiniz : ");
        System.out.println("Tek Yön : 1");
        System.out.println("Gidiş-Dönüş : 2");
        secim=scan.nextInt();
        if (km<=0){
            System.out.println("Mesafeyi Hatalı Girdiniz : ");
        } else if (yas<=0) {
            System.out.println("Yaşınızı Hatalı Girdiniz : ");
        } else if (secim !=1 && secim !=2) {
            System.out.println("Yolculuk Tipinizi Hatalı girdiniz : ");
        }else {
            if (secim==2){
                toplam=toplam*2;
                toplam=toplam*(1-0.20);
                System.out.println("Yolculuk tipi Gidiş dönüş tutar :"+toplam);
            }else {
                System.out.println("Yolculuk tipi tek yön");
            }

            if (yas<=12){
                indirim=toplam*(1-0.50);
                System.out.println("12 Yaş altı indirimli bilet alıyorsunuz ücret : "+indirim);
            } else if (yas>12 && yas<=24) {
                indirim=toplam*(1-0.10);
                System.out.println("12-24 yaş arasısınız indirimli bilet ücreti : "+indirim);
            } else if (yas>=65) {
                indirim=toplam*(1-0.30);
                System.out.println("65 yaş üstü indirimli bilet ücretiniz : "+indirim);
            } else {
                System.out.println("İndirim uygulanmayacak yaş aralığındasınız. Ücret : "+toplam);
            }
        }
    }
}
