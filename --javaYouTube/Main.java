package javaYouTube;

public class Main {
    public static void main(String[] args) {
        /*
        int sayi=20;
        if (sayi<20){
            System.out.println("Sayı 20 den küçük");
        } else if (sayi==20) {
            System.out.println("Sayı 20 eşittir");
        }else{
            System.out.println("Sayı 20 den büyüktür");
        }
        int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        if (sayi1>sayi2&&sayi1>sayi3){
            System.out.println("En büyük sayı"+sayi1);
        } else if (sayi2>sayi1&&sayi2>sayi3) {
            System.out.println("Enbüyük sayı "+sayi2);
        }else {
            System.out.println("Enbüyük sayı "+sayi3);
        }


        char not = 'D';
        switch (not) {
            case 'A':
                System.out.println("Mükemmel : geçtiniz ");
                break;
            case 'B':
                System.out.println("İyi : geçtiniz");
                break;
            case 'C':
                System.out.println("İdare eder : geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız ");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
          }3 ün kuvvetini bulan program üslü sayı 3 3*3 3*3*3
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }


        String[] ogrenciler={"Süleyman","Samet","Kübra"};
        for (int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }


        String[] ogrenciler=new String[3];
        ogrenciler[0]="mehmet";
        ogrenciler[1]="Süleyman";
        ogrenciler[2]="Benjamin";

        double toplam=0;
        double[] myList={1.2,1.3,1.4,5.1,3.1};
        double maxSayi=myList[0];
        for (double sayi:myList){
            if (maxSayi<sayi){
                maxSayi=sayi;
            }
            System.out.println(sayi);
            toplam+=sayi;
        }
        System.out.println("En büyük sayı : "+maxSayi);
        System.out.println("toplam : "+toplam);
         // bu sayıların toplamını versin


        String[][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="bursa";
        sehirler[0][2]="bilecik";
        sehirler[1][0]="ankara";
        sehirler[1][1]="konya";
        sehirler[1][2]="aksaray";
        sehirler[2][0]="diyarbakır";
        sehirler[2][1]="şanlıurfa";
        sehirler[2][2]="hakkari";
        for (int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
          Strinlerle çalışmak
         */
        String mesaj = "Buğün hava çok güzel";

        System.out.println(mesaj);
        System.out.println("Eleman sayısı = " + mesaj.length());//karakter sayısı
        System.out.println("5. eleman = " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));//karakter ekleme yeni bir strin oluşturur kullanılacaksa atanmalı
        System.out.println(mesaj.startsWith("B"));// b ile başlıyo mu
        System.out.println(mesaj.endsWith("l"));//l harfi ile bitiyo mu
        //java büyük kücük harf duyarlı bir dildir
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        // 0 indexden 4 indexe kadar karakterler arrayine 0 dan başlayarak atama yap
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//a karakterinin ilk nerde oldunu gösterir 7.karakter
        System.out.println(mesaj.lastIndexOf('e'));//sondan itibaren arama
        System.out.println(mesaj.replace(" ","_"));//bazı karakterleri değiştirmek için kullanırız
        System.out.println(mesaj.substring(2,4));//bir metin içerisinden parça alma 2. indexden 4.indexe kadar
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }//split ile kelimeleri boşluğa göre ayırdık
        System.out.println(mesaj.toLowerCase());//bütün harfler kücük
        System.out.println(mesaj.toUpperCase());//bütün harfler büyük
        System.out.println(mesaj.trim());//başına be sonunda boşlukları çıkarır


    }
}
