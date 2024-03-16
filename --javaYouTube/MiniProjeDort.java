package javaYouTube;

public class MiniProjeDort {
    public static void main(String[] args) {
        /*İki sayının kendileri hariç pozitif bölenleri toplamı birbirlerine eşitse
         bu sayılar arkadaş sayı olarak adlandırılır.
         Örneğin 220 ve 284 sayıları bir çift arkadaş sayıdır. Çünkü 220 sayısının kendisi
         hariç pozitif bölenleri 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 ve 110'dur
         Bu sayıların toplamı (1+2+4+5+10+11+20+22+44+55+110) ise 284’e eşittir.
         Aynı şekilde 284 sayısının kendisi
         hariç pozitif bölenleri 1, 2, 4, 71 ve 142’dir.
         Bu sayıların toplamı ise 220’e eşittir
         */
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        for (int i=1;i<sayi1;i++){//sayı 220 toplamı 284
            if (sayi1%i==0){
                toplam1+=i;
                System.out.println(toplam1);
            }
        }
        for (int j=1;j<sayi2;j++){//sayı 284 toplamı 220
            if (sayi2%j==0){
                toplam2+=j;
                System.out.println(toplam2);
            }
        }
        if (toplam1==sayi2&&toplam2==sayi1){
            System.out.println(sayi1+","+sayi2+" bu sayılar kardeş sayıdır");
        }else {
            System.out.println(sayi1+","+sayi2+" Bu sayılar kardeş sayı değildir");
        }
    }
}
