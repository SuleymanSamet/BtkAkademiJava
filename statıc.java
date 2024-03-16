public class statıc {
    public static void main(String[] args) {
        int a=10;

        Player p1=new Player("Süleyman",1);
        System.out.println(p1.name);
        System.out.println(p1.game);
        p1.login();


        Player p2=new Player("Samet",2);
        System.out.println(p2.name);
        System.out.println(p2.game);
        p2.login();

        Player p3=new Player("Kodluyoruz",3);
        System.out.println(p3.name);
        System.out.println(p3.game);
        p3.login();

        System.out.println(Player.count);



    }

}
