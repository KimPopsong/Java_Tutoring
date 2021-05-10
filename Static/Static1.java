package Static;

public class Static1 {
    static int a = 1;  //전역 변수로 사용 가능
    int b = 1;

    public void Print() {
        System.out.println("a : " + a);
        System.out.println("b : " + this.b);
    }

    public static void main(String[] args) {
        Static1 st1 = new Static1();
        Static1 st2 = new Static1();

        st1.Print();
        a += 1;
        Static1.a += 1;  // 객체를 생성하지않고 사용 가능
        st1.b += 1;
        st2.Print();
    }
}
