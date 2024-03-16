package javaornekproje;

import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {
//#Java ile girilen sayının harmonik serisini bulan programı yazınız.
        //1+(1/2)+(1/3)+(1/4)+(1/5)=1/5
        Scanner scanner=new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        int n=scanner.nextInt();
        double result=0;
        for (double i=1;i<=n;i++){
            result = result+(1.0/i);
        }
        System.out.println("Cevap : "+result);
    }
}
