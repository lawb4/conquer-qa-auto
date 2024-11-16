package javastepik.module2;

public class Main {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
    }

    // метод должен возвращать строку "чётное", если число чётное и строку "нечётное", если число нечётное
    public static String evenOrOdd(int a) {
        return a % 2 == 0 ? "Чётное" : "Нечётное";
    }
}
