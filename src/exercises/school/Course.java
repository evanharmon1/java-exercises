package exercises.school;

import java.util.ArrayList;

public class Course {

    public String courseName;
    public final int credits;
    private ArrayList<Student> students = new ArrayList<>(); //private for student privacy

    public Course(String courseName, int credits){
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void addStudent(Student aStudent) {
        this.students.add(aStudent);
    }

    public void getStudents() {
        for (Student student : students) {
            System.out.println(student.name);
        }
    }

}
