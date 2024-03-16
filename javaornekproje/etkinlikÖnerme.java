package javaornekproje;

import java.util.Scanner;

public class etkinlikÖnerme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sıcaklıkdrm;
        System.out.println("Sıcaklık derecesini yazın : ");
        sıcaklıkdrm=scan.nextInt();
        if (sıcaklıkdrm<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sıcaklıkdrm>=5&&sıcaklıkdrm<15) {
            System.out.println("Tiyatroya gidebilirsiniz.");
        } else if (sıcaklıkdrm>=15&&sıcaklıkdrm<25) {
            System.out.println("Mangal yapabilirsiniz ");
        }else {
            System.out.println("Yüzmek için harika bir hava ");
        }

    }
}
