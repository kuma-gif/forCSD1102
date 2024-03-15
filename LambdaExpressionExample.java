// เเบบไม่ใช้Lambda Expression
interface Drawable {
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 500;
        // ส่วนหัวของโปรแกรม
        System.out.println("แบบไม่ใช้ Lambda Expression");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("===========================");
        // ส่วนตัวโปรแกรม
        // without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}