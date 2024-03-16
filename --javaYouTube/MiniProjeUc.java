package javaYouTube;

public class MiniProjeUc {
    public static void main(String[] args) {
        //mükemmel sayı :
        //6->1,2,3,6
        //28_>1,2,4,7,14,28
        /*Örneğin 6 sayısını ele alalım: 1, 2, 3 ve 6 bu sayının bölenleridir ve
        tüm bu bölenlerin toplamı, yani 1+2+3+6, sayının iki katı olan 12'ye eşittir*/
        int sayi=5;
        int toplam=0;

        for (int i=1;i<=sayi;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (sayi*2==toplam) {

            System.out.println(sayi + " Bu sayı mükemmel sayıdır kendisinin 2 katını verir : "+toplam);
        }else {

            System.out.println(sayi+" Bu sayı mukemmel sayı değildir");
        }

    }
}
