package KalıtımInheritance;
//2.sayfa
//alt sınıf oldunu belirtmek için extends kullanırız
/*bir sınıf bir sınıfı extends yaparsa ilk kural kendi içerisinde çağırmak zorunda */
public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;
    public Akademisyen(String adSoyad,String telefon,String eposta,String bolum,String unvan){
        super(adSoyad,telefon,eposta);
        this.bolum=bolum;
        this.unvan=unvan;
        //sıralama önemli super anahtar sözcugu başta olur  set void
    }
    public String getBolum(){
        return bolum;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }
    public String getUnvan(){
        return bolum;
    }
    public void setUnvan(String unvan){
        this.unvan=unvan;
    }
    public void dersegir(){
        System.out.println(this.getAdSoyad()+" derse giriş yaptı");
    }

    @Override //@işaretiyle methodun ne oldunu belirtirz
    public void giris(){
        //method overriding methot ezme
        System.out.println(this.getAdSoyad() + "akademisyeni a kapısından giriş yaptı .");

    }

}
