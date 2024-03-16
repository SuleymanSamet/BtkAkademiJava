package kodlama.io;

import oopIntro.Product;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.id=1;
        course1.courseName="Java ve React";
        course1.detail="2 aylık Bootcamp";
        course1.teacherName="Engin Demirog";

        Course course2 = new Course();
        course2.id=2;
        course2.courseName="JavaScript";
        course2.detail="1.5 aylık Bootcamp";
        course2.teacherName="Engin Demirog";

        Course course3 = new Course();
        course3.id=3;
        course3.courseName="Java 2022";
        course3.detail="Yazılım geliştirici ve yetiştirme kampı";
        course3.teacherName="Engin Demirog";

        Course[] courses ={course1,course2,course3};
        for (Course course:courses){
            System.out.println(course.courseName);
        }

        Teacher teacher1=new Teacher(1,"Engin Demirog");
        Teacher[] teachers={teacher1};
        for (Teacher teacher:teachers){
            System.out.println(teacher.id);
        }
        CourseManager courseManager=new CourseManager();
        courseManager.addToCourse(course1);
        courseManager.addToCourse(course2);
        courseManager.addToCourse(course3);

        TeacherManager teacherManager=new TeacherManager();
        teacherManager.teacherSelect(teacher1);


    }
}
