package BtkAkademi.arraylistDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        //System.out.println(sayilar.size());
       // System.out.println(sayilar.get(2));
        //sayilar.set(0,100);
        //sayilar.remove(0); index kendini uçuur
        //sayilar.clear();
        //System.out.println(sayilar.get(0));
        for (Object i:sayilar){
            System.out.println(i);

        }
        
    }

}
