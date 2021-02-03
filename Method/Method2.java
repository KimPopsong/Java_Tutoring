package Method;

public class Method2 {
    int num = 5;

    public static void Plus(int a){
        a++;
    }

    public static void Plus(Method2 a){
        a.num++;
    }

    public static void main(String[] args) {
        int n = 10;
        Method2 m = new Method2();

        System.out.println("Before Method(n) : " + n);
        Plus(n);
        System.out.println("After Method(n) : " + n);

        System.out.println("Before Method(m) : " + m.num);
        Plus(m);
        System.out.println("After Method(m) : " + m.num);
    }
}