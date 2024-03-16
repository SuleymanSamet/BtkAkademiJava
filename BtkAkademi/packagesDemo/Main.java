package BtkAkademi.packagesDemo;

import BtkAkademi.packagesDemo.matematik.DortIslem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınız : ");
        String name=scanner.nextLine();
        System.out.println("yaşınızı giriniz :");
        int x = scanner.nextInt();
        System.out.println("Kaydınız yapılmıştır isim :"+name+" Yaşı: "+x);
        DortIslem dortIslem=new DortIslem();
        System.out.println("1.SAYI: ");
        int sayi1= scanner.nextInt();
        System.out.println("2.sayı: ");
        int sayi2= scanner.nextInt();
        dortIslem.bol(sayi1,sayi2);
        dortIslem.carp(sayi1,sayi2);

    }
}
