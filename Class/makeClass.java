package Class;

class makeClass {
    public static class Book{
        private String name;

        public static int count = 0;

        public Book(){
            System.out.println("BOOK() Called");
        }

        public Book(String name){
            this.name = name;
        }

        public String getBook() {
            return name;
        }

        public void setBook(String book) {
            this.name = book;
        }

        public void PlusCount(){
            count += 1;
        }

        public void getCount() {
            System.out.println(this.name + "'s count : " + count);
        }
    }

    public static void main(String[] args) {
        Book a = new Book();
        Book b = new Book();
        Book c = new Book("c");

        a.setBook("book1");
        b.setBook("book2");

        a.PlusCount();
        b.getCount();
        System.out.println(c.getBook());
    }
}