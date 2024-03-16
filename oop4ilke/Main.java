package oop4ilke;

public class Main {
    //encapsulation kapsülleme
    //inheritance kalıtım
    //polimorphism çok biçimlilik
    //abstracktion soyutlama
    //
    public static void main(String[] args) {
        Book harrypoter = new Book("harrypoter",150);
        Book lordoftherings = new Book("Lord of the rings",100);
        lordoftherings.setName("ABC");
        System.out.println(lordoftherings.getName());
    }
}
