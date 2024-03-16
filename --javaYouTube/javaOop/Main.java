package javaYouTube.javaOop;

public class Main {
    public static void main(String[] args) {
        //c# ile yapılan dersi javaya cevirerek tekrar ettik
        //interface abstract nedir ;

        //class nedir bizim içerisinde işlem yaparken bilgi tutan yapı
        /*
        CreditManager creditManager=new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();//örneğini oluşturmak - instance creation
        customer.id=1;
        customer.city="Aksaray";

        CustomerManager customerManager=new CustomerManager(new Customer());
        customerManager.Save();
        customerManager.Delete();

        Company company=new Company();
        company.taxNumber="12345";
        company.companyName="Beko";
        company.id=100;

        CustomerManager customerManager1=new CustomerManager(new Person());

        Person person=new Person();
        person.nationalIdentity="1235";

        Customer customer1=new Customer();
        Customer customer2=new Person();
        Customer customer3=new Company();

interface ler iş yapan sınıfların operasyonlarının sadece imza seviyesinde yazarak yazılımda bağımlılığı korumak için yapılan çalışma
         */
        //sonar qube
        //interface bir sınıfın ortak metotlarının imzasını barındırır
        //gerçek hayat tanımı
        //interface referans tipdir

        //IoC Container
        CustomerManager customerManager=new CustomerManager(new Customer(),new CarCreditManager());
        customerManager.giveCredit();






    }

}
