package exercises.school;

public class Student {

    public static int nextStudentId = 1;
    public String name;
    public int studentId;
    public int courseCredits = 0;
    public double gpa = 0.0; //Private due to necessity of being confident about grade tampering, etc.

    public Student(String name, int studentId, int courseCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.courseCredits = courseCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: courseCredits, gpa
        this.courseCredits = courseCredits;
        this.gpa = grade / courseCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on courseCredits
        if (this.courseCredits / 32 == 0) {
            return "Freshman";
        }
        if (this.courseCredits / 32 == 1) {
            return "Sophomore";
        }
        if (this.courseCredits / 32 == 2) {
            return "Junior";
        }
        if (this.courseCredits / 32 == 3) {
            return "Senior";
        }
        return "Error";
    }

    // Getters & Setters:
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int aNumberOfCredits) {
        courseCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
