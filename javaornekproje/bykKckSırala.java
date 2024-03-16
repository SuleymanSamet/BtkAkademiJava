package javaornekproje;

import java.util.Scanner;

public class bykKckSırala {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.print("1.Sayıyı giriniz : ");
        a=scan.nextInt();
        System.out.print("2.Sayıyı giriniz : ");
        b=scan.nextInt();
        System.out.print("3.Sayıyı giriniz : ");
        c=scan.nextInt();

        if (a>b && a>c){
            if (b>c){
                System.out.println(a+">"+b+">"+c);
            }
            if (c>b){
                System.out.println(a+">"+c+">"+b);
            }

        } else if (b>a && b>c) {
            if (a>c){
                System.out.println(b+">"+a+">"+c);
            }
            if (c>a){
                System.out.println(b+">"+c+">"+a);
            }
        } else {
            if (a>b){
                System.out.println(c+">"+a+">"+b);
            }
            if (b>a){
                System.out.println(c+">"+b+">"+a);
            }
        }
    }
}
