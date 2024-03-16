package KalıtımInheritance;

public class Bilgiİslem extends Memur{
    private String gorev;
    public Bilgiİslem(String adSoyad, String telefon, String eposta, String departman,String mesai,String gorev){
        super(adSoyad,telefon,eposta,departman,mesai);
        this.gorev=gorev;
    }
    public String getGorev(){
        return gorev;
    }
    public void setGorev(String gorev){
        this.gorev=gorev;
    }
    public void networkkur(){
        System.out.println(this.getAdSoyad()+" personel network kurulumunu yaptı.");
    }

}
