package javaYouTube;

public class MiniProjeBes {
    public static void main(String[] args) {
        // elimizde sayı dizisi olsun
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranan = 5;
        boolean varMı = false;
        for (int sayi : sayilar) {
            varMı = true;
            break;

        }
        if (varMı) {
            System.out.println(aranan + " bu sayı dize içerisinde vardır");
        } else {
            System.out.println(aranan + " sayısı dizede yoktur");
        }
    }
}
