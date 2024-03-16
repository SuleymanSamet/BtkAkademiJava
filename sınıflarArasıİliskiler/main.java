package sınıflarArasıİliskiler;

public class main {
    //bağımlılık uses a ilişkisi
    public static void main(String[] args) {
        Student st1 = new Student("Süleyman ","Yumuşak","123","Aksaray",50);
        Student st2 = new Student("Patika","java","123","Online",100);
        Student st3 = new Student("Kodluyoruz","Java102","145","Online",100);
        /*
        st3.setNote(100);//110 olan değer 100 den fazla oldugu için 0 gözüküyor bu yuzden 100 yaptık
        System.out.println(st3.getNote());

         */
        Course mat = new Course("Java101","JAVA");
        Student[] stu = {st1,st2,st3};

        System.out.println("Ortalama : "+mat.caclAvarage(stu));
    }
}
