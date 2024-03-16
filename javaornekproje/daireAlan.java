package javaornekproje;

import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r,pi,alan,cevre;
        System.out.println("Yarı çapını giriniz : ");
        r = scan.nextDouble();
        pi = Math.PI;
        alan = pi*r*r;
        System.out.println("Dairenin alanı : "+alan);
        cevre = 2*pi*r;
        System.out.println("Çevresi : "+cevre);
    }
}
