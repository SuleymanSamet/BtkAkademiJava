package javaYouTube.classesWithAttribute;

public class Main {
    public static void main(String[] args) {
        Product product=new Product(2,"Laptop","DELL",51100,3,"Siyah");
        product.setName("Laptop");
        product.setId(1);//bu şekilde set edilir
        //product.getId();//bu şekilde okur
        product.setDescription("ASUS Laptop");
        product.setPrice(51100);
        product.setStokeAmount(3);
        product.getKod();

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        //System.out.println(product.name);
        //bir class veya bir metot sadece bir işi yapar

    }
}
