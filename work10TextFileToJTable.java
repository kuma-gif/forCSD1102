import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class work10TextFileToJTable {

  public static void main(String[] args) {
    Runnable r = new Runnable() {

      public void run() {
        new work10TextFileToJTable().createUI();
      }
    };

    EventQueue.invokeLater(r);
  }

  private void createUI() {
    try {
      JFrame frame = new JFrame();
      frame.setLayout(new BorderLayout());
      JTable table = new JTable();

      String readLine = null;

      ProductTableModel tableModel = new ProductTableModel();
      File file = new File("product.txt"); // ใส่ชื่อไฟล์เพื่อดึงDataมา

      FileReader reader = new FileReader(file);
      BufferedReader bufReader = new BufferedReader(reader);

      List<Product> productList = new ArrayList<Product>();
      while ((readLine = bufReader.readLine()) != null) {
        String[] splitData = readLine.split(",");

        Product product = new Product();
        product.setName(splitData[0]);
        product.setNumber(splitData[1]);
        product.setPrice(splitData[2]);

        productList.add(product);
      }
      tableModel.setList(productList);
      table.setModel(tableModel);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new JScrollPane(table));
      frame.setTitle("สหรัถ อินต๊ะวิรา");
      frame.pack();
      frame.setVisible(true);
    } catch (IOException ex) {
    }
  }

  class Product {
    private String name;
    private String number;
    private String price;
    private int sum;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getNumber() {
      return number;
    }

    public void setNumber(String number) {
      this.number = number;
    }

    public String getPrice() {
      return price;
    }

    public void setPrice(String price) {
      this.price = price;
    }

    public int getSum() {
      this.sum = Integer.parseInt(number) * Integer.parseInt(price);
      return sum;
    }

    public void getSum(int sum) {
      this.sum = sum;
    }
  }

  class ProductTableModel extends AbstractTableModel {
    private List<Product> list = new ArrayList<Product>();
    private String[] columnNames = { "Product Name", "Number", "Price", "Sum" };

    public void setList(List<Product> list) {
      this.list = list;
      fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
      return columnNames[column];
    }

    public int getRowCount() {
      return list.size();
    }

    public int getColumnCount() {
      return columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
      switch (columnIndex) {
        case 0:
          return list.get(rowIndex).getName();
        case 1:
          return list.get(rowIndex).getNumber();
        case 2:
          return list.get(rowIndex).getPrice();
        case 3:
          return list.get(rowIndex).getSum();
        default:
          return null;
      }
    }
  }
}