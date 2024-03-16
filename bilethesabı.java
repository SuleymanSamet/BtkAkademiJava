import java.util.Scanner;

public class bilethesabı {
    public static void main(String[] args) {
        int km;
        int yas,secim;
        double yasIndirim=0,kmBasiUcret=0.10;
        double indirimliUcret;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Gidilen Toplam Mesafe nedir : ");
        km=scanner.nextInt();
        System.out.println("Yaşınız kaç : ");
        yas=scanner.nextInt();
        System.out.println("Bilet türünüz nedir \n 1=>tek yön \n 2=>gidiş dönüş ");
        secim=scanner.nextInt();

        if (km>0 &&yas>0 &&(secim==1||secim==2)){
            double ucret=km*kmBasiUcret;
            if (yas<12){
                yasIndirim=ucret*(1-0.50);
                System.out.println("12 yaş altı indirimli bilet fiyatı : "+yasIndirim+" TL");
            } else if (yas<24) {
                yasIndirim=ucret*(1-0.10);
                System.out.println("12-24 yaş arası öğrenci indirimli fiyat : "+yasIndirim+"TL");
            } else if (yas>65) {
                yasIndirim=ucret*(1-0.30);
                System.out.println("65 Yaş üstü indirimli bilet tutarı : "+yasIndirim+"TL");
            }
            if (secim==2){
                indirimliUcret=yasIndirim*(1-0.20);
                indirimliUcret*=2;
                System.out.println("Gidiş dönüş bileti için ekstra indirimli fiyat : "+indirimliUcret+"TL");
            }else {
                System.out.println("tek yön bilet");
            }


        }else {
            System.out.println("Hatalı Veri Girdiniz!");
        }


    }


}
