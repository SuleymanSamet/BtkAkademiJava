package javaornekproje;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi=scan.nextInt();

        for (int i=0 ; i<sayi;i++){
            if (i % 4 == 0 && i % 5 == 0){
                System.out.println("4 ve 5 bölünen sayılar "+ i);
            }
        }
    }
}
