package BtkAkademi.readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=null;
        int toplam=0;
        try {
            reader=new BufferedReader(new FileReader("C:\\javaCamp\\yukselis\\src\\BtkAkademi\\readingFileDemo\\sayilar.txt"));
            String line=null;
            while ((line =reader.readLine())!=null){
                toplam+=Integer.valueOf(line);
            }
            System.out.println(toplam);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();
        }

    }
}
