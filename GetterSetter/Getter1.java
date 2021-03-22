package GetterSetter;

public class Getter1 {
    int a = 1;  // alt + insert
    int b = 2;
    int c = 3;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static void main(String[] args) {
        Getter1 getter1 = new Getter1();

        System.out.println(getter1.getA());
        System.out.println(getter1.getB());
        System.out.println(getter1.getC());
    }
}
