package za.ac.cput.miniassignment;

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergrad = new UndergraduateStudent.Builder(
                "U001",
                "Likhona Noroyita",
                "likhona@email.com",
                "Information Technology")
                .creditHours(6)
                .scholarshipAmount(2000)
                .build();

        GraduateStudent graduate = new GraduateStudent.Builder(
                "G001",
                "John Smith",
                "john@email.com",
                "Computer Science")
                .researchAssistant(true)
                .stipend(5000)
                .build();

        PartTimeStudent partTime = new PartTimeStudent.Builder(
                "P001",
                "Sarah Daniels",
                "sarah@email.com",
                "Business Studies")
                .modulesEnrolled(3)
                .feePerModule(3500)
                .build();

        // Polymorphism demonstration
        Student[] students = { undergrad, graduate, partTime };

        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}