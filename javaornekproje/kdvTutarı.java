package javaornekproje;
import java.util.Scanner;
public class kdvTutarı {
    public static void main(String[] args) {
        double tutar,kdvtoplam,kdv,sonuc;
        Scanner input=new Scanner(System.in);
        System.out.println("Tutar fiyatını giriniz : ");
        tutar = input.nextDouble();

        if (tutar <= 500) {
            kdv = 18;
        } else {
            kdv = 8;
        }

        //kdvtoplam=(kdv*100)/tutar;
        kdvtoplam = (tutar * kdv) / 100;
        System.out.println("Kdv tutarı : "+kdvtoplam);
        sonuc=tutar+kdvtoplam;
        System.out.println("Kdv li toplam tutar : " +sonuc);


    }

}
