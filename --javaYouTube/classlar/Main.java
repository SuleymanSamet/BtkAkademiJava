package javaYouTube.classlar;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();//bu referans tutan kımse olmadıgı için çöp toplayıcı siler
        CustomerManager customerManager1=new CustomerManager();
        customerManager=customerManager1;//customermanager referans numarası =custımermanager1 referans numarasına eşittir
        customerManager.add();
        customerManager.remove();
        customerManager.uptade();
        //value tip
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);//çıktı 10 dur
        //diziler referans tip dir
        int[] sayilar={1,2,3};
        int[] sayilar2={4,5,6};
        sayilar2=sayilar;
        sayilar[0]=10;
        System.out.println(sayilar2[0]);// sonuc 10 dur


    }
}

