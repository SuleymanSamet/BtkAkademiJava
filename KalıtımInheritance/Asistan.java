package KalıtımInheritance;

public class Asistan extends Akademisyen{
    private String ofisSaat;
    public Asistan(String adSoyad,String telefon,String eposta,String bolum,String unvan,String ofisSaat){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.ofisSaat=ofisSaat;
    }
    public String getOfisSaat(){
        return ofisSaat;
    }
    public void setOfisSaat(String ofisSaat){
        this.ofisSaat=ofisSaat;
    }

    public void quizyap(){
        System.out.println(this.getAdSoyad()+" Asistan quiz yapmaya başladı ");
    }

}
