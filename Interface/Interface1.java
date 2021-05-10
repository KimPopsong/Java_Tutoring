package Interface;

interface Itf1 {  // 인터페이스의 메소드와 상수는 기본적으로 public
    public double PI = 3.14;  // 인터페이스는 필드 선언 불가. 상수만 가능.

    public void Print1();  // 인터페이스의 모든 메소드는 추상 메소드

    void Print2();  // public 생략
}

public class Interface1 {
    public static void main(String[] args) {
        //Itf1 itf1 = new Itf1();  // 인터페이스는 객체 생성 불가
    }
}
