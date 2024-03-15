import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class work8AboutFile1 {
  private static int numItems;

  public static void main(String[] args) throws Exception {
    String itemName, itemProduct, itemPrice;
    String Filename;
    int numItem;
    String total;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter File Name: ");
    Filename = keyboard.nextLine();
    FileWriter fileWriter = new FileWriter(Filename);
    PrintWriter outputFile = new PrintWriter(fileWriter);
    System.out.print("สินค้ากี่จำนวน");
    numItem = keyboard.nextInt();
    keyboard.nextLine();

    for (int i = 1; i <= numItem; i++) {
      System.out.print("ชื่อสินค้า");
      itemName = keyboard.nextLine();
      outputFile.println(itemName);

      System.out.print("จำนวนสินค้า");
      itemProduct = keyboard.nextLine();
      outputFile.println(itemProduct);

      System.out.print("ราคา");
      itemPrice = keyboard.nextLine();
      outputFile.println(itemPrice);
    }
    outputFile.close();
    System.out.println("Date written to the file.");
  }
}
