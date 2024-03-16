package javaornekproje;

import java.util.Scanner;

public class kuvvetProgramı {
    public static void main(String[] args) {
/*
Proje Konusu
#Java ile girilen sayıya kadar olan,
n değerininde kullacıdan alındığı
n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.

Örnek Çıktı
N Değerini Giriniz : 2
Sınır Değerini Giriniz : 20
1
2
4
8//2*2*2*2
16*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Değerini Giriniz : ");
        int n = scanner.nextInt();

        System.out.print("Sınır Değerini Giriniz : ");
        int limit = scanner.nextInt();

        int i = 1;
        while (i <= limit) {
            System.out.println(i);
            i *= n;
        }
    }
}