package BtkAkademi.hashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println("*************");
        for (String item:sozluk.keySet()){
            System.out.println("ingilizce : "+item+" turkce : "+sozluk.get(item));
        }

        System.out.println("*************");


        System.out.println(sozluk);
        sozluk.remove("table");
        System.out.println(sozluk.get("table"));

    }
}
