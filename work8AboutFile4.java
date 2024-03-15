import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class work8AboutFile4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ขอจำนวนรายวิชา
        System.out.print("กรุณาใส่จำนวนรายวิชา: ");
        int numCourses = scanner.nextInt();

        // รับคะแนนแต่ละรายวิชา
        double totalGrade = 0;
        for (int i = 1; i < numCourses; i++) {
            System.out.printf("รายวิชาที่ %d\n", i);
            System.out.print(" กรุณาใส่รายวิชา: ");
            String courseName = scanner.next();
            System.out.print(" กรุณาใส่คะแนน: ");
            double grade = scanner.nextDouble();
            totalGrade += grade;
        }

        // คำนวณเกรดเฉลี่ย
        double averageGrade = totalGrade / numCourses;
        System.out.printf("เกรดเฉลี่ย %.2f\n", averageGrade); // เพิ่ม %.2f เพื่อให้แสดงเป็นทศนิยมสองตำแหน่ง

        // เปลี่ยนคะแนนเป็นเกรด
        String letterGrade;
        if (averageGrade >= 80) {
            letterGrade = "A";
        } else if (averageGrade >= 75) {
            letterGrade = "B+";
        } else if (averageGrade >= 70) {
            letterGrade = "B";
        } else if (averageGrade >= 65) {
            letterGrade = "C+";
        } else if (averageGrade >= 60) {
            letterGrade = "D+";
        } else if (averageGrade >= 55) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.printf("เกรดเฉลี่ยที่ได้: %s\n", letterGrade);

        // เขียนข้อมูลลงในไฟล์
        try {
            System.out.print("กรุณาใส่ชื่อไฟล์: ");
            String fileName = scanner.next();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("เกรดเฉลี่ย: " + averageGrade + "\n");
            fileWriter.write("เกรดที่ได้: " + letterGrade + "\n");
            fileWriter.close();
            System.out.println("บันทึกข้อมูลลงในไฟล์ " + fileName + " เรียบร้อยแล้ว");
        } catch (IOException e) {
            System.out.println("เกิดข้อผิดพลาดขณะบันทึกไฟล์");
            e.printStackTrace();
        }
        scanner.close();
    }
}
