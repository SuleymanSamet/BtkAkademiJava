package KalıtımInheritance;

public class Patika {
    public static void main(String[] args) {
        Calisan c1=new Calisan("Süleyman Samet","05555555555","syumusak3@gmail.com");
        c1.giris();

        Akademisyen a1=new Akademisyen("Engin Demiroğ","0555555555","engin@gmail.com","CENG","Doçent");
        a1.cikis();
        Memur m1=new Memur("Ali Veli","0531526555","4950@gmail.com","Bilgi işlem","7-24");
        m1.calis();

        OgretimGorevlisi o1=new OgretimGorevlisi("Nadin q","0","n@gmail.com","Hayat okulu","Doçent","31");
        o1.giris();
        Asistan as1=new Asistan("Kadir","01","suger@gmail.com","Kesici alet","Profesor","10.00");
        as1.giris();

        LabAsistan l1=new LabAsistan("kubat","02","s@gmail.com","11","Asistan yardımcısı","11.00");
        l1.lablaragir();
        Bilgiİslem b1=new Bilgiİslem("Hızır","03","hız@gmail.com","IT","18.00","alt yapı");
        b1.networkkur();
        GuvenlikGorev g1=new GuvenlikGorev("Yakışıklı ","05","ahsanavahsana@gmail.com","güvenlik","20,00","Silahsız");
        g1.nobet();

        //Methot Overloading (metotlarda aşırı yüklenme)
        a1.giris();//bu kısımda akademisyen kullanıldıgı için override da kullanıldı
        a1.giris("09.00");
        a1.giris("8.30","18.00");

        //override method bu kısımda ögretim görevlisi ilk çalıştı
        o1.giris();

        System.out.println("********************");
        //polimorfizim (çok biçimlilik)
        /*kalıtım olmak zorundadır
        * */
        o1.giris();
        a1.giris();
        c1.giris();
        m1.giris();
        System.out.println("çok biçimlilik");
        Calisan a2=new Akademisyen("Çok biçimli","0555555555","engin@gmail.com","CENG","Doçent");
        a2.giris();//bu kod çok biçimlilik ile akademisyen gibi çalısmasını sağlar
        //çok biçimlilik mantık overrite edilmiş metotlara erişim sağlar getbolum() diye bir yer yok bu kişi bir çalısan fakat akademisyen gibi davranıyo
        //int[] loginUser = new int[5];
        Akademisyen[] loginUserr={o1,a1};
        //Akademisyen[] loginUser={o1,a1,c1,a2}; bu kod da c1 ve a2 hata verir çünkü ortak sınıf değiller bunu Calısan olarak atarsak
        Calisan[] loginUser={o1,a1,c1,a2};//bu sefer hata almadan çalısır çünkü Calısan ata sınıfdır
        Calisan.girisyapanlar(loginUser);





    }
}
