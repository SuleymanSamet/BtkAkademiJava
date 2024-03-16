package javaYouTube.classesWithAttribute;

public class ProductManager {
    public void Add(Product product){
        //jdbc ile kodları veri tabanına kayıt edicez
        System.out.println("Ürün eklendi "+product.getName());
    }
    public void Add(int id,String name,String description,int stockAmount,double price){
        //bu kullanım hatalı bir kullanımdır
    }
}
