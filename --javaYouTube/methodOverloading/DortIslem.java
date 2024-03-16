package javaYouTube.methodOverloading;

public class DortIslem {
    public int toplam(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    //ikisi arasında fark yok isimleri kullanabilir nedeni metot parametreleri farklı
    //buna metot overloading denir
    public int toplam(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2;
    }

}
