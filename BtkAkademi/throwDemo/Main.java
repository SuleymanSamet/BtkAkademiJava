package BtkAkademi.throwDemo;

public class Main {
    public static void main(String[] args){
        AccountManager accountManager=new AccountManager();
        System.out.println("hesap = "+accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("hesap = "+accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("hesap = "+accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("hesap = "+accountManager.getBalance());


    }
}
