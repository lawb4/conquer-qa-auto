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

        System.out.println("\n=== Task 3 Car ===");

        Car car = new Car("Tesla", "Model Y", 2024);
        car.setPrice(51490d);

        car.printCarInfo();

        System.out.println("\n=== Task 4 Product ===");

        Product product = new Product("Course about Productivity", "Productivity", Integer.MAX_VALUE, 990.90d);
        product.setQuantity(500);

        product.printProductInfo();

        System.out.println("\n=== Task 5 Student ===");

        Student[] students = {
                new Student("Viktor", 1, 3.3d),
                new Student("Margaret", 2, 4.0d),
                new Student("John", 3, 3.7d),
        };

        for (Student student : students) {
            student.printStudentDetails();
        }

        System.out.println("\n=== Task 6 Currency ===");

        Currency currencyByn = new Currency("BYN", 3.3512d);
        currencyByn.printCurrencyInfo();

        double amountToConvert = 3450.55d;
        System.out.printf("Сумма после конвертации %s BYN по курсу: %s", String.format("%.2f", amountToConvert), String.format("%.2f", currencyByn.convertToUSD(amountToConvert)));

        System.out.println("\n\n=== Task 7 Phone ===");

        Phone phone = new Phone("iPhone", "16 Pro Max", 1199d);

        phone.applyDiscount(15);
        phone.printPhoneDetails();

        System.out.println("\n=== Task 8 Employee ===");

        Employee employee1 = new Employee("Max", "Junior QA Engineer", 400d);
        Employee employee2 = new Employee("Victoriya", "Middle QA Engineer", 700d);
        Employee employee3 = new Employee("Vadim", "Senior QA Engineer", 2000d);

        employee1.increaseSalary(50d);
        employee2.increaseSalary(30d);
        employee3.increaseSalary(10d);

        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();
        employee3.printEmployeeInfo();

        System.out.println("\n=== Task 9 Triangle ===");

        Triangle triangle = new Triangle(2.23d, 3.34d, 4.67d);
        triangle.printTriangleInfo();

        System.out.println("\n\n=== Task 10 Player ===");

        Player player = new Player("N@G18aToR", 99, 101);
        player.levelUp();
        player.addScore(199);
        player.printPlayerInfo();

        System.out.println("\n\n=== Task 11 Rectangle ===");

        Rectangle rectangle = new Rectangle(3.14d, 7.18d);
        rectangle.printRectangleInfo();

        System.out.println("\n\n=== Task 12 Customer ===");

        Customer customer = new Customer("Viktor", "viktor1978@mailinator.com");

        customer.addPurchase("Гель для душа");
        customer.addPurchase("Т-образная бритва");
        customer.addPurchase("Пена для бритья");

        customer.printPurchaseHistory();

        System.out.println("\n\n=== Task 13 Company ===");

        Company company = new Company("OOO Beltelecom", 500, 1_000_000d);
        company.printCompanyInfo();
    }
}
