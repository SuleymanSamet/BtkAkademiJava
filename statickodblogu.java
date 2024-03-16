public class statickodblogu {
    //herhangi nesne üretmeden hafızaya alınan kod blogu
    public String name;
    public  static int counter;

    static {
        System.out.println("2.Adım Çalıstı");
        int random=(int)(Math.random()*10);
        System.out.println("3.Adım Random sayı : "+random);
        counter=random;
        System.out.println("4.adım counter varsayılan değer : "+counter);


    }

    public  statickodblogu(String name) {
        this.name = name;
        counter++;
        System.out.println("Counter yeni değer : "+counter);

    }
}
