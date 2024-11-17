package hw2;

import consulting.hw2.Book;
import consulting.hw2.Car;
import consulting.hw2.Person;
import consulting.hw2.Product;
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

    @Test
    public void testCarClass() {
        Car car1 = new Car("Tesla", "Model Y", 2024);
        car1.setPrice(51490d);
        Car car2 = new Car("Opel", "Vectra", 2003);

        String expectedPrintInfo = "Бренд: %s, Модель: %s, Год: %d, Цена: %s";

        String car1info = String.format(expectedPrintInfo,
                car1.getBrand(), car1.getModel(), car1.getYear(), car1.getPrice());
        String car2info = String.format(expectedPrintInfo,
                car2.getBrand(), car2.getModel(), car2.getYear(), car2.getPrice());

        assertEquals(car1info, "Бренд: Tesla, Модель: Model Y, Год: 2024, Цена: 51490.0");
        assertEquals(car2info, "Бренд: Opel, Модель: Vectra, Год: 2003, Цена: 0.0");
    }

    @Test
    public void testProductClass() {
        Product product1 = new Product("Course about Productivity", "Productivity", Integer.MAX_VALUE, 990.90d);
        Product product2 = new Product("Pill for every ill", "Health", 0, Double.MAX_VALUE);

        String expectedPrintInfo = "Товар: %s, Категория: %s, Количество: %d, Общая стоимость: %s";

        String expectedProduct1Info = "Товар: Course about Productivity, Категория: Productivity, Количество: 2147483647, Общая стоимость: 2127941545812.30";
        String expectedProduct2Info = "Товар: Pill for every ill, Категория: Health, Количество: 0, Общая стоимость: 0.00";

        String actualProduct1info = String.format(expectedPrintInfo,
                product1.getName(), product1.getCategory(), product1.getQuantity(), String.format("%.2f", product1.calculateTotalPrice()));
        String actualProduct2info = String.format(expectedPrintInfo,
                product2.getName(), product2.getCategory(), product2.getQuantity(), String.format("%.2f", product2.calculateTotalPrice()));

        assertEquals(expectedProduct1Info, actualProduct1info);
        
        assertEquals(0, product2.getQuantity());
        assertEquals(expectedProduct2Info, actualProduct2info);
    }
}
