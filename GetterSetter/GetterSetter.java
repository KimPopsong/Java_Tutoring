package GetterSetter;

import java.util.Scanner;

class GSsample{
    private int a;
    private String b;
    private boolean c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GSsample gSsample = new GSsample();

        gSsample.setA(1);
        gSsample.setB("Hello World!");
        gSsample.setC(true);

        System.out.println(gSsample.getA());
        System.out.println(gSsample.getB());
        System.out.println(gSsample.isC());

        sc.close();
    }
}
