package javaYouTube.classlar.reCapDemo_Hesapmakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();
        Scanner scanner=new Scanner(System.in);
        int sonuc;
        System.out.println("Lütfen ilk sayıyı giriniz :");
        int sayi1= scanner.nextInt();
        System.out.println("2.sayıyı giriniz :");
        int sayi2=scanner.nextInt();
        System.out.println("Yapmak istediniz işlemi seçin :\n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        int secim= scanner.nextInt();
        if (secim==1){
            sonuc=dortIslem.topla(sayi1,sayi2);
            System.out.println(sonuc);
        } else if (secim==2) {
            sonuc=dortIslem.cikarma(sayi1,sayi2);
            System.out.println(sonuc);
        }else if (secim==3){
            sonuc=dortIslem.carpma(sayi1,sayi2);
            System.out.println(sonuc);
        } else if (secim==4) {
            if (sayi2>0){
                sonuc=dortIslem.bolme(sayi1,sayi2);
                System.out.println(sonuc);
            }else {
                System.out.println("Bölen sayı sıfır olamaz");
            }
        }else {
            System.out.println("Hatalı tuşlama yaptınız!!");
        }


    }
}
