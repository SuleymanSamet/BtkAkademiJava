package javaYouTube.interfaces;

public class SqlServerCustomDal implements ICustumerDal{
    @Override
    public void add() {
        System.out.println("Sql server eklendi");
    }
}
