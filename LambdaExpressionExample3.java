interface Sayable {
    public String say();
}

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        // ส่วนหัวของโปรแกรม
        System.out.println("Java Lambda Expression แบบไม่มีพารามิเตอร์");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("===========================");
        // ส่วนตัวโปรแกรม
        Sayable s = () -> {
            return "I Love You.";
        };
        System.out.println(s.say());
    }
}
