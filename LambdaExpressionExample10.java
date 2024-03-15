import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        // ส่วนหัวของโปรแกรม
        System.out.println("Java Lambda Expression: การใช้งานกับ Collection: Sort");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("========================================================");
        // ส่วนตัวโปรแกรม
        List<Product> list = new ArrayList<Product>();

        // Adding Products
        list.add(new Product(1, "Dell Laptop", 70000f));
        list.add(new Product(3, "Magic Keyboard", 500f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}
