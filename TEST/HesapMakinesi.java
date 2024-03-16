package TEST;

import java.util.Scanner;

public class HesapMakinesi {
    public int topla(int a,int b){
        return a+b;
    }
    public int cikarma(int a,int b){
        return a-b;
    }
    public int carpma(int a,int b){
        return a*b;
    }
    public int bölme(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        Scanner giris = new Scanner(System.in);

        System.out.println("Yapmak istediniz işlemi seçin :");
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");

        int islem = giris.nextInt();

        System.out.print("İlk Sayıyı Giriniz :");
        int sayi1=giris.nextInt();

        System.out.print("İkinci Sayıyı Giriniz:");
        int sayi2= giris.nextInt();

        int sonuc=0;

        switch (islem){
            case 1:
                sonuc = hesapMakinesi.topla(sayi1,sayi2);
                break;
            case 2:
                sonuc = hesapMakinesi.cikarma(sayi1,sayi2);
                break;
            case 3:
                sonuc = hesapMakinesi.carpma(sayi1,sayi2);
                break;
            case 4:
                sonuc = hesapMakinesi.bölme(sayi1,sayi2);
                break;

        }
        System.out.println(islem+"işlemin sonucu: "+sonuc);


    }

}
