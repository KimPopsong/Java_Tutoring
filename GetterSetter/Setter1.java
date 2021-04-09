package GetterSetter;

public class Setter1 {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Setter1 setter1 = new Setter1();

        setter1.setA(1);
        setter1.setB(2);
        setter1.setC(3);

        System.out.println(setter1.a);
        System.out.println(setter1.b);
        System.out.println(setter1.c);
    }
}
