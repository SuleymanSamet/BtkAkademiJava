package BtkAkademi.repositoryDemo;

public class Main {
    public static void main(String[] args) {
        //veri tabanı işlmeleri için kullanılır
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validate(customer);

    }
}
