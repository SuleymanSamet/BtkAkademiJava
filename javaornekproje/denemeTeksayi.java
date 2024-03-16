package javaornekproje;

import java.util.Scanner;

public class denemeTeksayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        while (true){
            System.out.println("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();
            if (sayi<0){
                break;
            }
            if (sayi%2!=0){
                toplam+=sayi;
            }
        }
        System.out.println("Girilen Toplam Tek Sayılar : "+toplam);

    }
}
