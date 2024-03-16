package oopIntro;

public class Product {

    public Product(){
        //constructor yapıcı klasor istenilen kodu buraya yazarız
        System.out.println("ben çalıştım");

    }
    public Product(int id,String name,double unitPrice,String detail){
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;//this. demek bu klas daki demek
    }

    //ürün adı fiyatı detayı indirimi indirimli fiyatı
    int id;
    String name;
    double unitPrice;
    String detail;

}
