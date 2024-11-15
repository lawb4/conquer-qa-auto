package hw2;

/**
 * Список задач после видео со второй консультацией
 */
public class Tasks {

    /**
     * Проверка делимости 5 на 7
     * Напишите функцию, которая принимает целое число и возвращает true, если оно делится на 5 и на 7 одновременно, и false в противном случае
     */
    public static boolean isDivisibleByFiveAndSeven(int a) {
        return a % 5 == 0 && a % 7 == 0;
    }

    /**
     * Определение принадлежности числа интервалу
     * Создайте функцию, которая принимает число и проверяет, входит ли оно в интервал от 10 до 20 включительно. Если число попадает в интервал, верните true, иначе — false
     */
    public static boolean isBelongToInterval(int a) {
        return a >= 10 && a <= 20;
    }

    /**
     * Проверка на квадрат числа
     * Напишите функцию, которая принимает два числа и возвращает true, если одно из чисел является квадратом другого, и false в противном случае
     */
    public static boolean isSqrt(double a, double b) {
        return a == Math.sqrt(b) || b == Math.sqrt(a);
    }

    /**
     * Проверка последней цифры
     * Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5. Верните true, если заканчивается, и false, если нет
     */
    public static boolean isFiveLastDigit(int a) {
        String str = String.valueOf(a); // get String value of int a
        char charLastDigit = str.charAt(str.length() - 1); // get value from the last index (digit) of str and assign it to char
        int intLastDigit = Character.getNumericValue(charLastDigit); // get numeric value of char which contains the last index (digit)
        return intLastDigit == 5; // check if the numeric value of last digit = 5
    }

    /**
     * Проверка, является ли сумма цифр чётной
     * Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true, если сумма чётная и false, если нечётная
     */
    public static boolean isSumOfDigitsEven(int a) {
        // Convert the argument number to String
        String strDigits = String.valueOf(a);

        int sum = 0;
        // Create a loop to go through all the "digits" of the number-String
        for (int i = 0; i < strDigits.length(); i++) {
            // Get Integer value of every character (digit) of the number-String
            sum += Character.getNumericValue(strDigits.charAt(i));
        }
        return sum % 2 == 0;
    }

    /**
     * Сравнение двух чисел по модулю
     * Напишите функцию, которая принимает два числа и возвращает true, если модули числе равны, и false в противном случае
     */
    public static boolean isModulesEqual(int a, int b) {
        return Math.abs(a) == Math.abs(b);
    }

    /**
     * Проверка знака числа
     * Создайте функцию, которая принимает число и возвращает "Positive", если оно положительное, "Negative", если оно отрицательное, и "Zero", если оно равно нулю
     */
    public static String getNumberSign(int a) {
        return a > 0 ? "Positive" : a < 0 ? "Negative" : "Zero";
    }

    /**
     * Проверка делимости на 2 или 3
     * Напишите функцию, которая принимает число и возвращает true, если оно делится на 2 или на 3, и false в противном случае
     */
    public static boolean isDivisibleByTwoOrThree(int a) {
        return a % 2 == 0 || a % 3 == 0;
    }

    /**
     * Чётность суммы двух чисел
     * Создайте функцию, которая принимает два числа и возвращает "Even", если сумма чисел чётная, и и "Odd", если нечётная
     */
    public static String getSumOfTwoIsEven(int a, int b) {
        return (a + b) % 2 == 0 ? "Even" : "Odd";
    }

    /**
     * Определение числа, кратного и 4, и 6
     * Создайте функцию, которая проверяет, делится ли число на 4 и на 6 одновременно
     */

    /**
     * TODO тут 3 задачи я пока пропустил
     */

    /**
     * Максимум трёх чисел
     * Напишите функцию, которая принимает три числа и возвращает наибольшее из них
     */
    public static int getTheBiggestNumberOutOfThree(int a, int b, int c) {
//        if (a >= b && a >= c) {
//            return a;
//        } else if (b >= a && b >= c) {
//            return b;
//        } else {
//            return c;
//        }
        return Math.max(a, Math.max(b, c));
    }
}