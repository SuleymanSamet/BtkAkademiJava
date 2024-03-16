package javaYouTube.staticDemo;

public class ProductValidator {
    static {
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product){
        if (product.price>0&& !product.name.isEmpty()){
            //verilen ürünün veri tabanına girilmesi için fiyatının 0 dan büyük olması ve adı girilmiş olmas
            return true;
        }else {
            return false;
        }

    }
    public void bisey(){

    }
}
