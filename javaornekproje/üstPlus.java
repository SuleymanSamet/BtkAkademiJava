package javaornekproje;

import java.util.Scanner;

public class üstPlus {
    public static void main(String[] args) {
        /*
Bonus Geliştirme
Projede kullandığınız döngü tipinden farklı bir tip ile yapın.
(For ile yaptıysanız While ya da While ile yaptıysanız For döngüsü ile yapınız.)*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("taban sayısı: ");
        int x = scanner.nextInt();
        System.out.println("üst sayısı: ");
        int y=scanner.nextInt();
        int cevap=1;
        int i=0;
        while (i<y){
            cevap*=x;
            i++;
        }
        System.out.println("Cevap : "+cevap);

    }
}
