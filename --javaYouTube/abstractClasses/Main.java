package javaYouTube.abstractClasses;

public class Main {
    public static void main(String[] args) {
        //abstract klas ne dir ne için kullanılır örnek ver
        //abstract sınıflar classlarla yapısal anlamda bir farkı yoktur kullanım farkı vardır
        // abstract classları belli kurallardan geçirerek kullanabiliyoruz 1 sınıf sadece bşka bir 1 sınıfı inherit edebilir
WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
womanGameCalculator.hesapla();
womanGameCalculator.gameOver();

GameCalculator gameCalculator = new GameCalculator() {
    @Override //abstract sınıflar tek başına newlenemez olması için o metotu ezmemiz gerekli
    public void hesapla() {

    }
};

    }
}
