package javaYouTube.abstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();
    /*{ burda abstract kullanarak miras alanlar kendi hesapla metotunu yapmak zorunda
        System.out.println("Puanınız : 100");
    }*/
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
