public class Player {
    public String name;
    public int id;
    public static String game="cs";
    public static int count=0;

    public Player(String name,int id){
        this.name=name;
        this.id=id;
    }
    public  void login(){
        count++;
    }

}
