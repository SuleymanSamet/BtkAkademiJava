public class CourseMain {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT-101",70);
        Course tr = new Course("Türkce","TR-101",80);
        Course fen = new Course("Fen","FEN-101",90);

        int[] notlar ={70,80,90};
        mat.ortalama(notlar);
    }
}
