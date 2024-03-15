interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample5 {
    public static void main(String[] args) {
        // ส่วนหัวของโปรแกรม
        System.out.println("Java Lambda Expression: แบบพารามิเตอร์หลายตัว");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("===========================");
        // ส่วนตัวโปรแกรม
        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(100, 200));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(1000, 2000));
    }
}
