package Constructor;

public class Book2 {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book2() {
        this("");
        System.out.println("Book 생성자 끝");
    }

    public Book2(String title) {
        this(title, "작자미상");
        System.out.println("Book(title) 생성자 호출");
    }

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Book(title, author) 생성자 호출");
    }

    public static void main(String [] args) {
        Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
        Book2 loveStory = new Book2("춘향전");
        Book2 bible = new Book2();

        littlePrince.show();
        loveStory.show();
        bible.show();
    }
}
