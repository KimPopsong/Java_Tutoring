package AccessModifier;

class AmSample1 {
    /**
     *              같은 패키지의 클래스  /  다른 패키지의 클래스  /  접근 가능 영역
     * public    :         O                     X              모든 클래스
     * protected :         O                     X              동일 패키지와 자식 클래스
     * default   :         O                     X              동일 패키지
     * private   :         X                     X              동일 클래스
     */

    public int d = 3;
    protected int e = 4;
    private int f = 5;
}

public class AccessModifier1 {
    public int a = 0;
    protected int b = 1;
    private int c = 2;

    public static void main(String[] args) {
        AccessModifier1 ac1 = new AccessModifier1();
        AmSample1 amSample1 = new AmSample1();

        System.out.println(ac1.a);
        System.out.println(ac1.b);
        System.out.println(ac1.c);

        System.out.println(amSample1.d);
        System.out.println(amSample1.e);
        //System.out.println(amSample1.f);  // f는 private기 때문에 AccessModifier1에서 접근 불가
    }
}
