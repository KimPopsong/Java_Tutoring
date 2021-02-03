package Method;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("Method.Book 생성자 끝");
    }

    public Book(String title) {
        this(title, "작자미상");
        System.out.println("Method.Book(title) 생성자 호출");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Method.Book(title, author) 생성자 호출");
    }

    public static void main(String [] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book bible = new Book();

        littlePrince.show();
        loveStory.show();
        bible.show();
    }
}
