package javaYouTube.inheritance;

public class Main {
    //iki nesne arasında miras durumu bir nesne diğerine miras bırakır
    public static void main(String[] args) {
        Customer customer=new Customer();
        Employee employee=new Employee();


        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        employeeManager.BestEmployee();//3 tane ctrl+space
        customerManager.Add();//2tane ctrl+space

    }
}
