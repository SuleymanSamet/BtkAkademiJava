package BtkAkademi.workingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();




    }
    public static void createFile(){//dosya oluşturma
        File file=new File("C:\\javaCamp\\yukselis\\src\\BtkAkademi\\workingWithFiles\\files\\students.txt");
        try {

            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else {
                System.out.println("Dosya mevcuttur tekrardan oluşmadı");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file=new File("C:\\javaCamp\\yukselis\\src\\BtkAkademi\\workingWithFiles\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı : "+file.getName());//dosya ismi okuma
            System.out.println("Dosya yolu : "+file.getAbsoluteFile());//dosya yolu okuma
            System.out.println("Dosya yazılabilir mi : "+file.canWrite());//dosya yazılabilir mi
            System.out.println("Dosya okunabilir mi : "+file.canRead());//dosya okunabilir mi
            System.out.println("Dosya boyutu : "+file.length());//dosya büyüklüğü byte olarak
        }

    }
    public static void readFile(){
        File file=new File("C:\\javaCamp\\yukselis\\src\\BtkAkademi\\workingWithFiles\\files\\students.txt");
        try {
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javaCamp\\yukselis\\src\\BtkAkademi\\workingWithFiles\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
