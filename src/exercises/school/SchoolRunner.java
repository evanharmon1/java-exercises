package exercises.school;

public class SchoolRunner {

    public static void main(String[] args){
        Student evan = new Student("Evan Harmon", 1234, 15, 2);
        Student trevor = new Student("Trevor", 1234111, 2, 1);
        System.out.println(evan.getName());
        System.out.println(evan.getStudentId());
        System.out.println(evan.getCourseCredits());
        System.out.println(evan.getGpa());

        evan.setName("Bobevan Fofevan");
        evan.addGrade( 32, 30);

        System.out.println(evan.getName());
        System.out.println(evan.getStudentId());
        System.out.println(evan.getCourseCredits());
        System.out.println(evan.getGpa());
        System.out.println(evan.getGradeLevel());

        Course math = new Course("Math 101", 3);
        System.out.println(math.getCourseName());
        System.out.println(math.getCredits());
        math.addStudent(evan);
        math.addStudent(trevor);
        math.getStudents();
    }
}
