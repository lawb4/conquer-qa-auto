package hw2;

import consulting.hw2.Book;
import consulting.hw2.Person;
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

    @Test
    public void testPersonClass() {
        Person person1 = new Person();
        Person person2 = new Person("Alien", 987);
        Person person3 = new Person("Alexey", 27);
        person3.setGender("M");

        String expectedPrintInfo = "Имя: %s, Возраст: %d, Пол: %s";

        String person1Info = String.format(expectedPrintInfo,
                person1.getName(), person1.getAge(), person1.getGender());
        String person2Info = String.format(expectedPrintInfo,
                person2.getName(), person2.getAge(), person2.getGender());
        String person3Info = String.format(expectedPrintInfo,
                person3.getName(), person3.getAge(), person3.getGender());

        assertEquals(person1Info, "Имя: null, Возраст: 0, Пол: null");
        assertEquals(person2Info, "Имя: Alien, Возраст: 987, Пол: null");
        assertEquals(person3Info, "Имя: Alexey, Возраст: 27, Пол: M");
    }
}
