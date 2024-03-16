package javaornekproje;

import java.util.Scanner;

public class daireAlan2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double r,a,pi=3.14;
        System.out.println("Yarıçapı giriniz : ");
        r=scan.nextDouble();
        System.out.println("Merkez açı ölçüsü : ");
        a=scan.nextDouble();
        double alan = (pi*(r*r)*a/360);
        System.out.println("Dair merkezi alanı : "+alan);
    }
}
