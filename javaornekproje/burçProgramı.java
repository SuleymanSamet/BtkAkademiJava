package javaornekproje;

import java.util.Scanner;

public class burçProgramı {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum tarihiniz ay olarak : ");
        int ay = scan.nextInt();
        System.out.print("Doğum tarihiniz gün olarak : ");
        int gun = scan.nextInt();

        if (ay > 0 && ay < 13) {
            if (ay == 1) {
                if (gun <= 21) {
                    System.out.println("Oğlak burcusunuz ");
                } else {
                    System.out.println("Kova burcusunuz ");
                }
            }
            if (ay == 2) {
                if (gun <= 19) {
                    System.out.println("Kova burcusunuz ");
                } else {
                    System.out.println("Balık burcusunuz");
                }
            }
            if (ay == 3) {
                if (gun <= 20) {
                    System.out.println("Balık burcusunuz");
                } else {
                    System.out.println("Koç burcusunuz");
                }
            }
            if (ay == 4) {
                if (gun <= 20) {
                    System.out.println("Koç burcusunuz");
                } else {
                    System.out.println("Boğa burcusunuz");
                }
            }
            if (ay == 5) {
                if (gun<=21){
                    System.out.println("Boğa burcusunuz");
                }else {
                    System.out.println("İkizler burcusunuz");
                }

            }
            if (ay==6){
                if (gun<=22){
                    System.out.println("İkizler burcusunuz");
                }else {
                    System.out.println("Yengeç burcusunuz");
                }
            }
            if (ay==7){
                if (gun<=22){
                    System.out.println("Yengeç burcusunuz");
                }else {
                    System.out.println("Aslan Burcusunuz");
                }
            }
            if (ay==8){
                if (gun<=22){
                    System.out.println("Aslan burcusunuz");
                }else {
                    System.out.println("Başak burcusunuz");
                }
            }
            if (ay==9){
                if (gun<=22){
                    System.out.println("Başak burcusunuz");
                }else {
                    System.out.println("Terazi burcusunuz");
                }
            }
            if (ay==10){
                if (gun<=22){
                    System.out.println("Terazi burcusunuz");
                }else{
                    System.out.println("Akrep burcusunuz");
                }
            }
            if (ay==11){
                if (gun<=21){
                    System.out.println("Akrep burcusunuz");
                }else {
                    System.out.println("yay burcusunuz");
                }
            }
            if (ay==12){
                if (gun<=21){
                    System.out.println("Yay burcusunuz");
                }
                else {
                    System.out.println("Oğlak burcusunuz");
                }
            }

        } else {
            System.out.println("Hatalı giriş yaptınız tekrar deneyin");
        }

    }
}

