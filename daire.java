public class daire {
    public int r;
    public final double PI=3.14; //final büyük harfle yazılır boşluk yerine alt çizgi kullanılır
    public daire(int r){
        this.r=r;
    }
    public void calcArea(){
        double area=PI * this.r;
        System.out.println("Dairenin alanı : "+area);
    }
}
