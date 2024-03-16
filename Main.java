public class Main {
    public static void main(String[] args) {
        String internetSubeButonu ="İnternet Şubesi";//camelCase kullanılır
        int dolarDun=8;
        double dolarBugun=8.17;//virgül değil nokta
        int vade=36;
        boolean dustuMu=false;

        //main kodun çalışmaya başlangıc noktası
        /* Dont repeat yourself = kendini tekrar etme
        * System.out.println() çıktı almak için kullanırız kısayolu sout
        */
        if (dolarBugun<dolarDun){
            System.out.println("Dolar düştü resmi");
        }else if (dolarBugun==dolarDun){//burada iki eşittir konur
            System.out.println("Dolar aynı kaldı resmi");

        }else{
            System.out.println("Dolar Yükseldi resmi");
        }

        //listeleri tutmak için diziler
        String[] krediler={"Tarım","hızlı","Emekli","Konut","Meb"};
        //foreach
        for (String kredi : krediler){
            System.out.println(kredi);
        }
        System.out.println("---------------");
        for (int i=0; i<krediler.length;i++){
            System.out.println(krediler[i]);
        }
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println(sayi1);//sayi1 değeri 20 dir

        int[] sayilar1 = {1,2,3,4,5};
        int[] sayiler2 = {10,20,30,40,50};
        sayilar1=sayiler2;
        sayiler2[0] = 100;
        System.out.println(sayilar1[0]);//cevap 100 sebebi

        System.out.println(internetSubeButonu);
        System.out.println("Hello world!");

    }
}
