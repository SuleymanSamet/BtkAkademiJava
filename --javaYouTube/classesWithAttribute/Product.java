package javaYouTube.classesWithAttribute;

public class Product {

    //ürün classı
    //attribute veya field denir
    private int id;//ürünü tanımlayan eşsiz değer
    private String name;//adı
    private String description;//açıklaması
    private double price;//fiyatı
    private int stokeAmount;//stok adedi
    private String renk;
    private String kod;

    //encapsulation kapsülleme denilen yöntem kullanıcıyı alanı kullanmak için kısıtlar

    //public her yerden ulaşılabilir demektir default olarak seçilidir

    //int id;
    //public String name;

    //private özel demektir sadece tanımlandığı blokta geçerlidir demektir
    //private String description

    public Product(int id, String name, String description, double price, int stokeAmount, String renk) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stokeAmount = stokeAmount;
        this.renk = renk;

    }
    public Product(){
        //buraya aşırı yükleme denir parametresiz method olarak çalışır isteyen istediğini alır

    }


    //getter=getirmek okuma amaçlı ve setter= kurmak set etmek başka yerden ulaşmak için kullanırız

    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id=id;//this bu class demek
    } //bize geri değer döndürmesine gerek olmadıgı ıcın
    // void kullanırız set edilen değer parametre olarak verilmeli setId(int id)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStokeAmount() {
        return stokeAmount;
    }

    public void setStokeAmount(int stokeAmount) {
        this.stokeAmount = stokeAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


}
