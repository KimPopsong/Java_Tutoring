package Interface;

interface PhoneInterface {
    int BUTTONS = 20; // 상수 필드 선언

    void sendCall();

    void receiveCall();
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();

    void receiveSMS();
}

interface MP3Interface { // 인터페이스 작성
    public void play();

    public void stop();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {  // class를 상속받으며 interface 또한 상속받음
    @Override
    public void sendCall() {
        System.out.println("전화 걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받기");
    }

    @Override
    public void sendSMS() {
        System.out.println("SMS 보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("SMS 받기");
    }

    // MP3 Interface의 추상 메소드 구현
    @Override
    public void play() {
        System.out.println("음악 재생");
    }

    @Override
    public void stop() {
        System.out.println("재생 중지");
    }

    // 추가로 작성한 메소드
    public void schedule() {
        System.out.println("일정 관리");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.calculate(3, 5));
        p.schedule();
    }
}
