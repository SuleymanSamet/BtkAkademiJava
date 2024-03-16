package javaYouTube;

public class MiniProjeBir {
    public static void main(String[] args) {
        //sayı asalmı 1 ve kendinden başka pozitif böleni olmayan sayılara asal sayıdır
        int sayi=23;
        int reminde =sayi%2;
        boolean asalMi=true;
        if (sayi<2){
            System.out.println("Asal sayı değildir");
            return;
        }
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                asalMi=false;
            }
        }
        if (asalMi){
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }
}
