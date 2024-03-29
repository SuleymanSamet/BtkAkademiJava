package javaornekproje;

import java.util.Scanner;

public class artıkYıl {
    public static void main(String[] args) {
        /*
        * Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
        * Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına
        * 29 Şubat’ın eklenmesi ile elde edilir.

        Formül ;
        Artık yıllar 4 rakamının katı olan yıllardır:
        *  1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece
        * 400'e kalansız olarak bölünebilenler artık yıldır:
        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak
        *  1700, 1800 ve 1900 artık yıl değildir.
        Sadece 400'e tam olarak bölünebilenlerin artık
        * yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil,
        * yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        int yil=scan.nextInt();

        if ((yil % 4==0 && yil % 100 != 0) || (yil % 400 == 0)){
            System.out.println("Bu yıl artık yıldır : "+yil);
        }else {
            System.out.println("Artık yıl değildir : "+yil);
        }


    }
}
