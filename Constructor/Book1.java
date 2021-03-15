package Constructor;

public class Book1 {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book1() {
        this("", "");
        System.out.println("Constructor.Book 생성자 끝");
    }

    public Book1(String title) {
        this(title, "작자미상");
        System.out.println("Constructor.Book(title) 생성자 호출");
    }

    public Book1(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Constructor.Book(title, author) 생성자 호출");
    }

    public static void main(String [] args) {
        Book1 littlePrince = new Book1("어린왕자", "생텍쥐페리");
        Book1 loveStory = new Book1("춘향전");
        Book1 bible = new Book1();

        littlePrince.show();
        loveStory.show();
        bible.show();
    }
}
