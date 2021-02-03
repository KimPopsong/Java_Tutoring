package Inheritance;

class A {
    public A() {
        System.out.println("Constructor A Operated");
    }
}

class B extends A {
    public B() {
        System.out.println("Constructor B Operated");
    }
}

class C extends B {
    public C(){
        // super();  // 생략해도 무관
        System.out.println("Constructor C Operated");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println();

        B b = new B();
        System.out.println();

        C c = new C();
    }
}
