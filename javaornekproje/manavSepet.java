package javaornekproje;

import java.util.Scanner;

public class manavSepet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salatalik=3.14,elma=4.11,kabak=2.22,domates=0.95,patlıcan=7.00;
        double salatalıkkg,elmakg,kabakkg,domateskg,patlıcankg,tfiyat;

        System.out.print("Salatalık kaç kilo : ");
        salatalıkkg = scan.nextDouble();
        System.out.print("Elma kaç kilo : ");
        elmakg = scan.nextDouble();
        System.out.print("Kabak kaç kilo : ");
        kabakkg = scan.nextDouble();
        System.out.print("Domates kaç kilo : ");
        domateskg= scan.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        patlıcankg = scan.nextDouble();

        tfiyat = (salatalik*salatalıkkg)+(elma*elmakg)+(kabak*kabakkg)+(domates*domateskg)+(patlıcankg*patlıcan);
        System.out.println("Sepet tutarı : "+tfiyat+" tl");



    }
}
