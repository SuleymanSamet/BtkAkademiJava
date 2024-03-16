package KalıtımInheritance;

public class LabAsistan extends Asistan{
    public LabAsistan(String adSoyad,String telefon,String eposta,String bolum,String unvan,String ofisSaat){
        super(adSoyad,telefon,eposta,bolum,unvan,ofisSaat);
    }
    public void lablaragir(){
        System.out.println(this.getAdSoyad() + " Lablara giriş yaptı.");
    }
}
