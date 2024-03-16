package javaYouTube.overriding;

public class BaseCrediManager {
    public double hesapla(double tutar){//public 'final' double ile final anahtarı kullanırsak miras alıcılarının bu metotu ezmesini engelleriz
        return tutar*1.18;
    }


}
