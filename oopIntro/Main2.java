package oopIntro;

public class Main2 {
    public static void main(String[] args) {
        Product product1 = new Product();//bir class oluşturulurken önce bu yapılır örnek oluşturma referans olusturma
        product1.id=1;
        product1.name="lenovo v14";
        product1.unitPrice=15000;
        product1.detail="16 gb ram";

        Product product2 = new Product();//bir class oluşturulurken önce bu yapılır örnek oluşturma referans olusturma
        product2.id=2;
        product2.name="lenovo v15";
        product2.unitPrice=20000;
        product2.detail="16 gb ram";

        Product product3 = new Product();//bir class oluşturulurken önce bu yapılır örnek oluşturma referans olusturma
        product3.id=3;
        product3.name="Dell";
        product3.unitPrice=13000;
        product3.detail="8 gb ram";
        //****claslar referans tiptir

        //psql kullanılacak veri tabanı olarak
        //e ticaret sitesi örnek alınacak
        // objelerle çalışılacak - kısaltmalar kullanma
        Product[] products={product1,product2,product3};
        //  veriTürü takmaIsım
        for (Product product :products) { // çoğul tekil isimlendirme kullanılır
            System.out.println(product.name);
        }
        System.out.println(products.length);

        Category category1 = new Category();
        category1.id=1;
        category1.name="bilgisayar";

        Category category2 = new Category();
        category2.id=2;
        category2.name="telefon";

        //classı kullanma yönetemi
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);//metot sepete ekleme işi yapıcaksa parantez içine data koyup yollanır buna da parametre denir
        productManager.addToCart(product2);
        productManager.addToCart(product3);

    }
}
