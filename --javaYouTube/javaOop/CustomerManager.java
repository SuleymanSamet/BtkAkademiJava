package javaYouTube.javaOop;

public class CustomerManager {
    private Customer customer;
    private ICreditManager icreditManager;

    public CustomerManager(Customer customer,ICreditManager icreditManager) {
        this.customer=customer;
        this.icreditManager=icreditManager;

    }

    public void save(){
        System.out.println("Müşteri kayıt edildi : ");
    }
    public void delete(){
        System.out.println("Müşteri Silindi :");
    }
    public void giveCredit(){
        icreditManager.calculate();
        System.out.println("kredi verildi");
    }


}
