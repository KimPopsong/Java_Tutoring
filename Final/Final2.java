package Final;

public class Final2 {
    private int a = 0;

    final public int getA() {  // getter는 값을 가져오는 함수이므로 final을 붙임
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Final2 f2 = new Final2();

        System.out.println(f2.getA());
        f2.setA(7);
        System.out.println(f2.getA());
    }
}