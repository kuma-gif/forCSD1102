import java.util.*;

public class LambdaExpressionExample7 {
    public static void main(String[] args) {
        // ส่วนหัวของโปรแกรม
        System.out.println("Java Lambda Expression: แบบใช้กับ Foreach Loop");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("===========================");
        // ส่วนตัวโปรแกรม
        List<String> list = new ArrayList<String>();
        list.add("Durian");
        list.add("banana");
        list.add("WaterMelon");
        list.add("mango");

        list.forEach(
                (n) -> System.out.println(n));
    }
}
