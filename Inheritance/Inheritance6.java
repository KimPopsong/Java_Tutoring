package Inheritance;

class A2 {
    public A2() {
        System.out.println("Constructor A Operated");
    }

    public A2(int x) {
        System.out.println("Constructor A with Parameter Operated");
    }
}

class B2 extends A2 {
    public B2() {
        super(1);
        System.out.println("Constructor B Operated");
    }

    public B2(int x) {
        // super는 반드시 첫 줄에
        System.out.println("Constructor B with Parameter Operated");
    }
}

class C2 extends B2 {
    public C2() {
        System.out.println("Constructor C Operated");
    }

    public C2(int x) {
        super(x);
        System.out.println("Constructor C with Parameter Operated");
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        A2 a2 = new A2(2);
        System.out.println();

        B2 b2 = new B2(2);
        System.out.println();

        C2 c2 = new C2(2);
    }
}
