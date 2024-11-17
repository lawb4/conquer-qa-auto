package consulting.hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 1 Book ===");

        Book book1 = new Book("Book title", "Book author", 0d);
        book1.setTitle("Software Testing. Base course");
        book1.setAuthor("Svyatoslav Kulikov");
        book1.setPrice(999d);
        System.out.printf("Title: %s; Author: %s; Price: %s",
                book1.getTitle(), book1.getAuthor(), String.format("%.2f", book1.getPrice()));

        System.out.println("\n\n=== Task 2 Person ===");

        Person person1 = new Person();
        Person person2 = new Person("Alien", 987);
        Person person3 = new Person("Alexey", 27);
        person3.setGender("M");

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
    }
}
