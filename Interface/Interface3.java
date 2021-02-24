package Interface;

interface Itf5 {
    void Print();
}

interface Itf6 extends Itf5 {

}

interface Itf7 {
    void Hi();
}

class MobilePhone implements Itf6, Itf7 {  // class 또한 마찬가지로 여러개의 interface 상속 가능
    private int number = 1;

    @Override  // Itf6가 Itf5를 상속받고
    public void Print() {  // Itf5에 Print 메소드가 있었으므로
        System.out.println("Hello World!");  // 구현해야함
    }

    @Override
    public void Hi() {
        System.out.println("Hi World!");
    }

    public void setNumber(int number) {  // 추가적인 메소드 구현 가능
        this.number = number;
    }
}

public class Interface3 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.Print();
        mobilePhone.Hi();
        mobilePhone.setNumber(10);
    }
}
