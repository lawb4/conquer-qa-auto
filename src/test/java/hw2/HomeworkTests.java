package hw2;

import consulting.hw2.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTests {

    @Test
    public void testBookClass() {
        Book book1 = new Book("Book title", "Book author", 0d);
        book1.setTitle("Software Testing. Base course");
        book1.setAuthor("Svyatoslav Kulikov");
        book1.setPrice(999d);
        
        assertEquals(book1.getTitle(), "Software Testing. Base course");
        assertEquals(book1.getAuthor(), "Svyatoslav Kulikov");
        assertEquals(book1.getPrice(), 999d);
    }
}
