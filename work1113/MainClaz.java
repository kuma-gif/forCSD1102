public class MainClaz {
    public static void main(String[] args) {
        // สร้างวิว
        StudentView studentView = new StudentView();

        // สร้างนักศึกษา
        Student student = new Student("John", "Doe", "12345", "Computer Science", "123 Main St", "john@example.com");

        // สร้างคอนโทรลเลอร์และผูกกับนักศึกษาและวิว
        StudentController studentController = new StudentController(student, studentView);

        // แสดงข้อมูลนักศึกษา
        studentController.displayStudentInformation();
    }
}
