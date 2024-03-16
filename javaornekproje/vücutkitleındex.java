package javaornekproje;

import java.util.Scanner;

public class vücutkitleındex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double kg,boy;

        System.out.println("Kilonuzu giriniz : ");
        kg = scan.nextDouble();
        System.out.println("Boyunuzu girin : ");
        boy = scan.nextDouble();

        double index = kg / (boy * boy);
        System.out.println("Vücut kitle indexsiniz : "+index);
        if (index<18.5){
            System.out.println("Zayıf");
        } else if (index >= 18.5 && index <=24.9) {
            System.out.println("İdeal");
        } else if (index>=25 && index<=29.9) {
            System.out.println("şişman");
        } else if (index>=30 && index<=34.9) {
            System.out.println("obez");
        }else {
            System.out.println("Aşırı obez");
        }

    }
}
