package Abstract;

abstract class Abs3 {
    abstract public void Print();
}

abstract class Abs4 extends Abs3 {  // 상속받은 추상 메소드를 구현하지 않아도 됌
}

class Abs5 extends Abs3 {
    public void Print() {  // 상속받은 추상 메소드는 무조건 구현해야함
        System.out.println("Hello World!");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Abs5 abs5 = new Abs5();

        abs5.Print();
    }
}
