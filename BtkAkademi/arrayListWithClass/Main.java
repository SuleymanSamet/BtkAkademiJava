package BtkAkademi.arrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer>customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Süleyman","Yumusak"));
        customers.add(new Customer(2,"Samet","Gündoğdu"));
        customers.add(new Customer(3,"Engin","Demiroğ"));



        for (Customer customer:customers){
            System.out.println(customer.firsName);
        }
    }
}
