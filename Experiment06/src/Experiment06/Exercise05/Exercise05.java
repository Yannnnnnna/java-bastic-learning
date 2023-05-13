package Experiment06.Exercise05;

public class Exercise05 {
    public static void main(String[] args) {
        Course course = new Course("数学");
        course.addStudents("aaa");
        course.addStudents("bbb");
        course.addStudents("ccc");
        course.addStudents("ddd");
        course.dropStudent("ccc");
        System.out.println(course.toString());

    }
}
