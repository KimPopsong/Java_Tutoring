package AccessModifier;

import AccessModifier.Package1.AccessModifier2;

public class AccessModifier3 {
    public static void main(String[] args) {
        AccessModifier2 ac2 = new AccessModifier2();

        System.out.println(ac2.a);

        //System.out.println(ac2.b);
        //System.out.println(ac2.c);

        System.out.println(ac2.getB());
        System.out.println(ac2.getC());

        ac2.setB(3);
        System.out.println(ac2.getB());
    }
}
