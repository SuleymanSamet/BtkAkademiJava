package javaornekproje;

import java.util.Scanner;

public class çiftVeDördünKatı {
/*
Bonus Geliştirme
Java ile girilen değerlerden çift ve 4'ün katları olan
sayıları toplayıp ekrana basan programı yazıyoruz.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam=0;
        while (true){
            System.out.println("Lütfen bir sayı girin : ");
            int sayi = scanner.nextInt();
            if (sayi<0){
                break;
            }
            if (sayi % 2 == 0 ){
                toplam+=sayi;
            }
        }
        System.out.println("Toplam : "+toplam);


    }
}
