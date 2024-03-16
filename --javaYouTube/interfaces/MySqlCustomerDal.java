package javaYouTube.interfaces;

public class MySqlCustomerDal implements ICustumerDal{
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
