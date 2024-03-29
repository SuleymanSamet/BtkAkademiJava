package sınıflarArasıİliskiler;

public class Course {
    private String courseName;
    private String code;

    public Course(String courseName,String code){
        this.courseName=courseName;
        this.code=code;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCode(){
        return code;
    }
    public void setCode(){
        this.code=code;
    }
    public double caclAvarage(Student[]students){
        double avarage=0.0;
        for (Student student : students) {
            avarage += student.getNote();
        }
        return avarage/students.length;
    }
}
