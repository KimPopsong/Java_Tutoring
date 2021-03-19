package Variable;

public class Variable1 {
    public static void main(String[] args) {
        int a = 0;  // 선언과 동시에 초기화 가능
        int b, c, d;  // 동시에 여러개 선언 가능

        b = 1;
        c = 2;  // 선언 후 나중에 초기화 가능

        //System.out.println(d);  // 선언 후 초기화하지 않으면 사용 불가

        char e;  // int는 정수형, char은 문자형
        char f;

        e = 'H';  // char는 한 개의 문자를 가질 수 있음
        //f = 'HI';  // 두 개, 또는 문자열을 입력받을 시 에러

        System.out.println(a);  // 변수 하나만 출력하거나
        System.out.println(a + b + c);  // 변수의 합 출력가능
        System.out.println(a + " " + b + " " + c);
    }
}
