package BtkAkademi.arrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Aksaray");
        sehirler.remove(0);
        //yukardaki gibi yada alttaki gibi silebiliriz
        sehirler.remove("İstanbul");

        Collections.sort(sehirler);//sıralama
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
