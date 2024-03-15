interface Sayable {
    String say(String message);
}

public class LambdaExpressionExample8 {
    public static void main(String[] args) {
        // ส่วนหัวของโปรแกรม
        System.out.println("Java Lambda Expression: แบบหลายคำสั่ง");
        System.out.println("SAHARAT INTAVIRA");
        System.out.println("===========================");
        // ส่วนตัวโปรแกรม
        // You can pass multiple statements in lambda expression
        Sayable person = (message) -> {
            String str1 = "I am going to study, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("traffic jam."));
    }
}
