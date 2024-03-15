import java.io.*;
import java.util.Scanner;

public class work8AboutFile2 {

  public static void main(String[] args) {
    String item = " ";
    int product = 0, price = 0, total = 0;
    double vat = 0, sumTotal = 0, sum = 0;
    try {
      Scanner in = new Scanner(new FileReader("Sell001.txt"));

      while (in.hasNext()) {
        item = in.nextLine();
        product = Integer.parseInt(in.nextLine());
        price = Integer.parseInt(in.nextLine());
        total = product * price;
        System.out.println(
          item + " " + product + "ชิ้น" + price + "บาท" + total + "บาท"
        );
        sumTotal += total;
      }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    vat = sumTotal * 0.07;
    sum = sumTotal + vat;

    System.out.println(sumTotal + "บาท");
    System.out.println(vat + "บาท");
    System.out.println(sum + "บาท");
  }
}
