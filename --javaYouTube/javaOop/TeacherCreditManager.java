package javaYouTube.javaOop;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        //öğretmen kredisine göre hesaplamalar var
        System.out.println("Öğretmen kredisi hesaplandı");
    }

}
