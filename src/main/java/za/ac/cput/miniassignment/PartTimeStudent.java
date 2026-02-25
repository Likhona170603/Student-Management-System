package za.ac.cput.miniassignment;

public class PartTimeStudent extends Student {

    private int modulesEnrolled;
    private double feePerModule;

    private PartTimeStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.modulesEnrolled = builder.modulesEnrolled;
        this.feePerModule = builder.feePerModule;
    }

    @Override
    public double calculateTuition() {
        return modulesEnrolled * feePerModule;
    }

    @Override
    public String getStudentType() {
        return "Part-Time Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("===== " + getStudentType() + " =====");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Modules Enrolled: " + modulesEnrolled);
        System.out.println("Fee Per Module: R" + feePerModule);
        System.out.println("Total Tuition: R" + calculateTuition());
        System.out.println();
    }

    public static class Builder {

        private String studentId;
        private String name;
        private String email;
        private String department;

        private int modulesEnrolled;
        private double feePerModule;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder modulesEnrolled(int modulesEnrolled) {
            this.modulesEnrolled = modulesEnrolled;
            return this;
        }

        public Builder feePerModule(double feePerModule) {
            this.feePerModule = feePerModule;
            return this;
        }

        public PartTimeStudent build() {
            return new PartTimeStudent(this);
        }
    }
}