package javaornekproje;

import java.util.Scanner;

public class basitHesapmakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,seçim;
        System.out.println("1.sayıyı giriniz :");
        sayi1 = scan.nextInt();
        System.out.println("2.sayıyı giriniz :");
        sayi2 = scan.nextInt();

        System.out.println("İşleminizi seçin :");
        System.out.println("Toplama işlemi için 1");
        System.out.println("Çıkarma işlemi için 2");
        System.out.println("Çarpma işlemi için 3");
        System.out.println("Bölme işlemi için 4");
        System.out.println("Seçilen işlem ");
        seçim=scan.nextInt();

        if (seçim==1){
            System.out.println("Toplam :"+(sayi1+sayi2));
        } else if (seçim==2) {
            System.out.println("Çıkarma :"+(sayi1-sayi2));
        } else if (seçim==3) {
            System.out.println("Çarpma :"+(sayi1*sayi2));
        }else {
            System.out.println("bölme :"+(sayi1/sayi2));
        }


    }
}
