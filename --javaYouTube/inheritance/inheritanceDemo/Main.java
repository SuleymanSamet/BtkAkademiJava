package javaYouTube.inheritance.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        /*
        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();
         */
         KrediUI krediUI=new KrediUI();
         krediUI.KrediHesapla(new OgretmenKrediManager());//buraya ister ögretmen ister tarım gönderebiliriz
        //nedeni ise baseKrediManager ikisininde atası oldugu için asker öğretmen tarım istenilen çalışır




    }

}
