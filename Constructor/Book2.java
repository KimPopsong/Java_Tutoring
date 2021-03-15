package Constructor;

public class Book2 {
    String title;
    String author;

    public Book2(String t) { // 생성자
        title = t;
        author = "작자미상";
    }

    public Book2(String t, String a) { // 생성자
        title = t;
        author = a;
    }

    public static void main(String [] args) {
        Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
        Book2 loveStory = new Book2("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}