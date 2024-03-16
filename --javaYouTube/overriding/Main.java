package javaYouTube.overriding;

public class Main {
    public static void main(String[] args) {
        BaseCrediManager[] baseCrediManagers=new BaseCrediManager[]{new OgretmenCrediManager(),new TarimCrediManager(),new OgrenciCrediManager()};
        for (BaseCrediManager baseCrediManager:baseCrediManagers ){
            System.out.println(baseCrediManager.hesapla(1000));

        }
    }
}
