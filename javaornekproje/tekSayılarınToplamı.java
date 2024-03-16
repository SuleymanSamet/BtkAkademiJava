package javaornekproje;

import java.util.Scanner;

public class tekSayılarınToplamı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        while (true) {
            System.out.print("Sayı Giriniz : ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num % 2 != 0) {
                toplam += num;
            }
        }
        System.out.println("Toplam : " + toplam);
    }
}

