package AccessModifier;

public class AccessModifier1 {
    public int a = 3;
    protected int b = 4;
    private int c = 6;

    public static void main(String[] args) {
        AccessModifier1 ac1 = new AccessModifier1();

        System.out.println(ac1.a);
        System.out.println(ac1.b);
        System.out.println(ac1.c);
    }
}