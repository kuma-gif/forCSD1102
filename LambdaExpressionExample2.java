interface Drawable {
    public void draw();
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width = 500;
        // ส่วนหัวของโปรแกรม
        System.out.println("แบบใช้ Java Lambda Expression");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("============================");
        // ส่วนตัวโปรแกรม
        // with lambda
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
