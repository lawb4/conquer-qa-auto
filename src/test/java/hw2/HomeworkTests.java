package hw2;

import org.junit.jupiter.api.Test;

import static hw2.Tasks.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTests {

    @Test
    public void testIsDivisibleByFiveAndSeven() {
        assertTrue(isDivisibleByFiveAndSeven(35));
        assertTrue(isDivisibleByFiveAndSeven(70));

        assertFalse(isDivisibleByFiveAndSeven(5));
        assertFalse(isDivisibleByFiveAndSeven(7));
        assertFalse(isDivisibleByFiveAndSeven(34));
    }

    @Test
    public void testIsBelongToInterval() {
        assertTrue(isBelongToInterval(20));
        assertTrue(isBelongToInterval(19));
        assertTrue(isBelongToInterval(11));
        assertTrue(isBelongToInterval(10));

        assertFalse(isBelongToInterval(9));
        assertFalse(isBelongToInterval(21));
    }

    @Test
    public void testIsSqrt() {
        assertTrue(isSqrt(4, 2));
        assertTrue(isSqrt(16, 4));

        assertFalse(isSqrt(100, 3));
    }

    @Test
    public void testIsFiveLastDigit() {
        assertTrue(isFiveLastDigit(5));
        assertTrue(isFiveLastDigit(375));
        assertTrue(isFiveLastDigit(-5));
        assertTrue(isFiveLastDigit(-15));
        assertTrue(isFiveLastDigit(555));

        assertFalse(isFiveLastDigit(3));
        assertFalse(isFiveLastDigit(0));
    }

    @Test
    public void testIsSumOfDigitsEven() {
        assertTrue(isSumOfDigitsEven(11)); //2
        assertTrue(isSumOfDigitsEven(345)); //12

        assertFalse(isSumOfDigitsEven(1)); //1
        assertFalse(isSumOfDigitsEven(23)); //5
    }

    @Test
    public void testIsModulesEquals() {
        assertTrue(isModulesEqual(2, -2));
        assertTrue(isModulesEqual(-4, 4));
        assertTrue(isModulesEqual(0, 0));

        assertFalse(isModulesEqual(12, -67));
        assertFalse(isModulesEqual(-99, -45));
    }

    @Test
    public void testGetNumberSign() {
        assertEquals(getNumberSign(1), "Positive");
        assertEquals(getNumberSign(-1), "Negative");
        assertEquals(getNumberSign(0), "Zero");
    }

    @Test
    public void testIsDivisibleByTwoOrThree() {
        assertTrue(isDivisibleByTwoOrThree(2));
        assertTrue(isDivisibleByTwoOrThree(3));
        assertTrue(isDivisibleByTwoOrThree(6));
        assertTrue(isDivisibleByTwoOrThree(-12));
        assertTrue(isDivisibleByFiveAndSeven(0));

        assertFalse(isDivisibleByTwoOrThree(1));
        assertFalse(isDivisibleByTwoOrThree(-5));
    }

    @Test
    public void testGetSumOfTwoIsEven() {
        assertEquals(getSumOfTwoIsEven(2, 4), "Even");
        assertEquals(getSumOfTwoIsEven(0, 0), "Even");
        assertEquals(getSumOfTwoIsEven(-1, 1), "Even");
        assertEquals(getSumOfTwoIsEven(-2, -4), "Even");

        assertEquals(getSumOfTwoIsEven(-1, -4), "Odd");
        assertEquals(getSumOfTwoIsEven(3, 6), "Odd");
    }

    @Test
    public void testIsNumberMultipleOfFourAndSix() {
        assertTrue(isNumberMultipleOfFourAndSix(24));
        assertTrue(isNumberMultipleOfFourAndSix(-48));
        assertTrue(isNumberMultipleOfFourAndSix(0));

        assertFalse(isNumberMultipleOfFourAndSix(4));
        assertFalse(isNumberMultipleOfFourAndSix(6));
        assertFalse(isNumberMultipleOfFourAndSix(-44));
        assertFalse(isNumberMultipleOfFourAndSix(-66));
    }

    @Test
    public void testGetSumOfTwoIsEvenAndDivisibleByTen() {
        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(6, 4), "Even and Divisible by 10");
        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(-12, -8), "Even and Divisible by 10");
        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(0, 0), "Even and Divisible by 10");

        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(2, 2), "Even but not Divisible by 10");
        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(-5, -1), "Even but not Divisible by 10");

        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(6, 3), "Odd");
        assertEquals(getSumOfTwoIsEvenAndDivisibleByTen(-4, -3), "Odd");
    }

    @Test
    public void testGetTheBiggestNumberOutOfThree() {
        assertEquals(getTheBiggestNumberOutOfThree(3, 2, 1), 3);
        assertEquals(getTheBiggestNumberOutOfThree(20, 789, 7), 789);
        assertEquals(getTheBiggestNumberOutOfThree(-194, -3, 0), 0);

        assertEquals(getTheBiggestNumberOutOfThree(100, 100, 90), 100);
        assertEquals(getTheBiggestNumberOutOfThree(80, 120, 120), 120);
        assertEquals(getTheBiggestNumberOutOfThree(150, 70, 150), 150);
        assertEquals(getTheBiggestNumberOutOfThree(300, 300, 300), 300);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(isPalindrome(11));
        assertTrue(isPalindrome(121));
        assertTrue(isPalindrome(12321));
        assertTrue(isPalindrome(0));

        assertFalse(isPalindrome(123));
        assertFalse(isPalindrome(-12321));
        assertFalse(isPalindrome(-1));
    }
}
