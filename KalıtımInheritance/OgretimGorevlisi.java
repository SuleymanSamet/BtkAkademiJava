package KalıtımInheritance;

public class OgretimGorevlisi extends Akademisyen{
    //akademisyene ait constractır yazmak zorunda
    private String kapiNo;
    public OgretimGorevlisi(String adSoyad,String telefon,String eposta,String bolum,String unvan,String kapiNo){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.kapiNo=kapiNo;
    }

    public String getKapiNo(){
        return kapiNo;
    }
    public void setKapiNo(String kapiNo){
        this.kapiNo=kapiNo;
    }
    @Override //@işaretiyle methodun ne oldunu belirtirz
    public void giris(){
        //method overriding methot ezme
        System.out.println(this.getAdSoyad() + "akademisyeni b kapısından giriş yaptı .");

    }
}
