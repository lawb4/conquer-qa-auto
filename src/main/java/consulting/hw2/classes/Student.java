package consulting.hw2.classes;

public class Student {
    private String name;
    private int studentId;
    private double gpa;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentDetails() {
        System.out.printf("Студент: %s, ID: %s, GPA: %.1f\n",
                this.name, this.studentId, this.gpa);
    }
}