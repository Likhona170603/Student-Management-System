package za.ac.cput.miniassignment;

public abstract class Student {

    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    protected Student(String studentId, String name, String email, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public abstract double calculateTuition();
    public abstract String getStudentType();
    public abstract void displayStudentDetails();
}