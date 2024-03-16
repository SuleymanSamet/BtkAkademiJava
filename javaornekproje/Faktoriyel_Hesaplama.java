package javaornekproje;

import java.util.Scanner;

public class Faktoriyel_Hesaplama {
    public static void main(String[] args) {
/*#Java ile kullanıcını girdiği değerinin faktöriyelini hesaplayan programı yazın.

Örnek Çıktı
Faktöriyel Sayısı : 3
Sonuç : 6*/
        //faktoriyel formuk : !5=5*4*3*2*1
        Scanner scanner= new Scanner(System.in);
        System.out.println("Faktoriyeli alınacak sayıyı giriniz : ");
        int x =scanner.nextInt();
        int cevap=1;
        for (int i=1;i<=x;i++){
            cevap*=i;
        }
        System.out.println("Sonuç : "+cevap);
    }
}
