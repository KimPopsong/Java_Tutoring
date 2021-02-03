package AccessModifier.Package1;

public class AccessModifier2 {
    public int a = 1;
    protected int b = 2;
    private int c = 3;
    int d = 4;  // 접근 지정자 표시를 하지 않으면 private

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
