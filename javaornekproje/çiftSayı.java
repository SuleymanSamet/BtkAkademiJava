package javaornekproje;

import java.util.Scanner;

public class çiftSayı {
    //java ile kullanıcının girdiği sayıya kadar çift sayıları bulan program
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaçıncı sayıya kadar çift bulmak istiyorsunuz : ");
        int sayi=scan.nextInt();
        for (int i =1;i<=sayi;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
