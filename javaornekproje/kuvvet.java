package javaornekproje;

import java.util.Scanner;

public class kuvvet {
    public static void main(String[] args) {
/*#Java ile girilen sayıya kadar olan, n değerininde kullacıdan alındığı n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.

Örnek Çıktı
N Değerini Giriniz : 2
Sınır Değerini Giriniz : 20
1
2
4
8
16*/
        Scanner scanner= new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz : ");
        int x=scanner.nextInt();
        System.out.print("Sınır değerini giriniz : ");
        int y=scanner.nextInt();

        for (int i=1;i<=y;i*=x){
            System.out.println(i);
        }
    }
}
