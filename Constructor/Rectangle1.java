package Constructor;

import java.util.Scanner;

public class Rectangle1 {
    int width;
    int height;

    public Rectangle1() {
    }  // 기본 생성자

    public Rectangle1(int w, int h) {  // 정수 값 두개를 받아 width와 height에 할당해주는 생성자
        this.width = w;
        height = h;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle1 textbook = new Rectangle1();  // textbook 객체 생성
        Rectangle1 notebook = new Rectangle1(10, 30);  // notebook은 임의 값 넣어주기

        textbook.width = scanner.nextInt();  // textbook의 width 값 입력
        textbook.height = scanner.nextInt();  // textbook의 height 값 입력

        System.out.println("Textbook : " + textbook.getArea());  // getArea로 textbook의 넓이 반환
        System.out.println("Notebook : " + notebook.getArea());  // getArea로 notebook의 넓이 반환

        scanner.close();
    }
}
