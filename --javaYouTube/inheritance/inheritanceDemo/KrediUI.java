package javaYouTube.inheritance.inheritanceDemo;

public class KrediUI {
    /*böyle yapmak yerine
    public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager){
        ogretmenKrediManager.Hesapla();
    }

     */
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.Hesapla();
    }

}
