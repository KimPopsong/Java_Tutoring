package Final;

final public class Final1 {  // 상속 불가
    final public void Print() {  // 메소드 오버라이딩 불가
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        //final -> C/C++의 const와 같은 역할

        final int a = 1;  // 상수 선언(변수 X)

        //a = 3;  // 에러 발생
    }
}
