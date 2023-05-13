package Experiment06.Exercise05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Object> students ;
    private int numberOfStudents;

    public Course(String courseName) {
        students = new ArrayList<>();
        this.courseName = courseName;
    }

    //改写增加学生
    public void addStudents(String student){
        students.add(student);
    }
    public ArrayList<Object> getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    //写减少学生
    public void dropStudent(String student){
        //找到要删掉的学生
       students.remove(student);
    }
    //删掉所有学生
    public void clear(Course course){
       students.clear();
    }
    public String toString(){
        return "学生为：" + students.toString();
    }

}
