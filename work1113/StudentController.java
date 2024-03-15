public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void updateStudentInformation(String firstName, String lastName, String stuid, String course, String address, String email) {
        student = new Student(firstName, lastName, stuid, course, address, email);
    }

    public void displayStudentInformation() {
        studentView.displayStudentInformation(student);
    }
}
