public class StudentView {
    public void displayStudentInformation(Student student) {
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Student ID: " + student.getStuid());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Email: " + student.getEmail());
    }
}
