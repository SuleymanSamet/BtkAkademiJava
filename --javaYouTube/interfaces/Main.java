package javaYouTube.interfaces;

public class Main {
    public static void main(String[] args) {
        //interface operasyonu onu ayrıca implamente etsin dediğimizde kullanırız
        CustomerManager customerManager=new CustomerManager(new SqlServerCustomDal());
        /*1. yöntem
        customerManager.iCustumerDal=new SqlServerCustomDal();
        customerManager.add();

         */



    }
}
