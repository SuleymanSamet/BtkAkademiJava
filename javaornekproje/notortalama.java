package javaornekproje;
import java.util.Scanner;

public class notortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik,matematik,turkce,kimya,muzik,tarih,sonuc;
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        System.out.println("Matamatik Notunuz giriniz : ");
        matematik=input.nextInt();
        System.out.println("Türkce Notunuzu giriniz : ");
        turkce=input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya=input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik=input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih=input.nextInt();

        double ortalama=(fizik+kimya+matematik+turkce+muzik+tarih)/6.0;
        String durum = (ortalama>60)?"Sınıfı geçtiniz ":"Sınıfta kaldınız " ;
        System.out.println("Genel Not Ortalamanız : "+ortalama);
        System.out.println(durum);
    }
}
