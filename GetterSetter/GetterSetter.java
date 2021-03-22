package GetterSetter;

import java.util.Scanner;

public class GetterSetter {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        GetterSetter getterSetter = new GetterSetter();
        Scanner sc = new Scanner(System.in);

        getterSetter.setA(1);
        getterSetter.setB(sc.nextInt());

        System.out.println(getterSetter.getA());
        System.out.println(getterSetter.getB());
    }
}
