package Method;

public class Method1 {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static String Sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3, b = 4;
        String c = "Hello ", d = "World!";

        int sumNum = Sum(a, b);
        String sumStr = Sum(c, d);

        System.out.println(sumNum);
        System.out.println(sumStr);
    }
}