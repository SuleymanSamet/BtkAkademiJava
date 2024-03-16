package javaornekproje;

import java.util.Scanner;

public class Üstİşlemi {
    public static void main(String[] args) {
        /*#Java ile kullanıcının girdiği değerler ile üs alan programı yazın.

Örnek Çıktı
Üs Alınacak Sayı : 2
Üs Olacak Sayı : 3
Cevap : 8
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban sayısı : ");
        int x=scanner.nextInt();//2
        System.out.println("Üst sayısı : ");
        int y=scanner.nextInt();//3 2*2*2
        int cevap=1;
        for (int i=0;i<y;i++){
            cevap*=x;
        }
        System.out.println("Cevap : "+cevap);
    }
}
