public class Exercise07 {
    public static void main(String[] args) {
        Course course = new Course();
        course.addStudents("xiaoming");
        course.addStudents("xiaohong");
        course.addStudents("xiaoliang");
        course.dropStudent("xiaohong");
        System.out.println(course.getNumberOfStudents());
        String []students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }
}
class Course{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    //改写增加学生
    public void addStudents(String student){
        if(numberOfStudents == students.length){
            String []newStudent = new String[numberOfStudents * 2];
            System.arraycopy(students, 0, newStudent, 0, students.length);
            students = newStudent;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
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
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(student)) {
                index = i;
                break;
            }
        }
        //创建一个长度减一的数组，把要删掉的学生后面的学生补位上来
        String []newStudent = new String[numberOfStudents - 1];
        System.arraycopy(students, 0, newStudent, 0, index);
        System.arraycopy(students, index + 1, newStudent, index,numberOfStudents - index - 1);
        students = newStudent;
        numberOfStudents--;
    }
    //删掉所有学生
    public void clear(Course course){
        course.numberOfStudents = 0;
        String []newStudents = new String[0];
        course.students = newStudents;
    }
}
