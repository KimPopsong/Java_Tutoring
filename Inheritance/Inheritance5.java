package Inheritance;

class A1 {
    public A1() {
        System.out.println("Constructor A Operated");
    }

    public A1(int x) {
        System.out.println("Constructor A with Parameter Operated");
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("Constructor B Operated");
    }

    public B1(int x) {
        System.out.println("Constructor B with Parameter Operated");
    }
}

class C1 extends B1 {
    public C1() {
        System.out.println("Constructor C Operated");
    }

    public C1(int x) {
        System.out.println("Constructor C with Parameter Operated");
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        A1 a1 = new A1(1);
        System.out.println();

        B1 b1 = new B1(1);
        System.out.println();

        C1 c1 = new C1(1);
    }
}
