package javaornekproje;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double km,yolucreti=2.20,tutar,acilis=10;
        System.out.println("Gidilen km : ");
        km=scanner.nextDouble();
        tutar=km*yolucreti+acilis;
        if (tutar<20){
            tutar=20;
        }
        System.out.println("Toplam ücret : "+tutar);


    }
}
