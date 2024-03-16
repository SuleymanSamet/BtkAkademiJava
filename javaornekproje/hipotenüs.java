package javaornekproje;

import java.util.Scanner;

public class hipotenüs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. kenarı giriniz : ");
        int a = scan.nextInt();

        System.out.println("2. kenarı giriniz : ");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+(int)c);

        double u=(a+b+c)/2;
        double cevre = 2*u;
        System.out.println("Üçgenin çevresi : "+cevre);
        double Alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı : "+Alan);
    }

}
