package Abstract;

abstract class Abs1 {
    public void Print1() {
        System.out.println("Hello World!");
    }

    abstract void Print2();  // abstract 메소드는 body가 없음
}
/*
class Abs2{
    public abstract void Print1();  // abstract를 사용하였기 때문에
}  // class를 abstract로 선언하여야 함
*/

public class Abstract1 {
    public static void main(String[] args) {
        //Abs1 abs1 = new Abs1();  // 추상 클래스는 객체 생성 불가
    }
}
