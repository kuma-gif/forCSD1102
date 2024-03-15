interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample6 {
    public static void main(String[] args) {
        // ส่วนหัวของโปรแกรม
        System.out.println("Java Lambda Expression: แบบมีและไม่มี return");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("===========================");
        // ส่วนตัวโปรแกรม
        // Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(100, 200));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(1000, 2000));
    }
}
