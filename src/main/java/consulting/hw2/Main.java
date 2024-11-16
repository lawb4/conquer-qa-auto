package consulting.hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 1 ===");

        Book book1 = new Book("Book title", "Book author", 0d);
        book1.setTitle("Software Testing. Base course");
        book1.setAuthor("Svyatoslav Kulikov");
        book1.setPrice(999d);
        System.out.printf("Title: %s; Author: %s; Price: %s",
                book1.getTitle(), book1.getAuthor(), String.format("%.2f", book1.getPrice()));
    }
}
