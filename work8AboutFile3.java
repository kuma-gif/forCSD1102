import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class work8AboutFile3 {
  private static int numItems;

  public static void main(String[] args) throws Exception {
    String NameClass, UnitClass, GradeClass;
    String Filename;
    int numClass;
    String total;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter File Name: ");
    Filename = keyboard.nextLine();
    FileWriter fileWriter = new FileWriter(Filename);
    PrintWriter outputFile = new PrintWriter(fileWriter);
    System.out.print("กี่วิชา: ");
    numClass = keyboard.nextInt();
    keyboard.nextLine();

    for (int i = 1; i <= numClass; i++) {
      System.out.print("ชื่อวิชา");
      NameClass = keyboard.nextLine();
      outputFile.println(NameClass);

      System.out.print("จำนวนหน่วยกิต");
      UnitClass = keyboard.nextLine();
      outputFile.println(UnitClass);

      System.out.print("เกรด");
      GradeClass = keyboard.nextLine();
      outputFile.println(GradeClass);
    }
    outputFile.close();
    System.out.println("Data Written to the file.");
  }
}
