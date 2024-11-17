package hw1;

import org.junit.jupiter.api.Test;

import static consulting.hw1.Tasks.*;
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
        assertEquals("Positive", getNumberSign(1));
        assertEquals("Negative", getNumberSign(-1));
        assertEquals("Zero", getNumberSign(0));
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
        assertEquals("Even", getSumOfTwoIsEven(2, 4));
        assertEquals("Even", getSumOfTwoIsEven(0, 0));
        assertEquals("Even", getSumOfTwoIsEven(-1, 1));
        assertEquals("Even", getSumOfTwoIsEven(-2, -4));

        assertEquals("Odd", getSumOfTwoIsEven(-1, -4));
        assertEquals("Odd", getSumOfTwoIsEven(3, 6));
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
        assertEquals("Even and Divisible by 10", getSumOfTwoIsEvenAndDivisibleByTen(6, 4));
        assertEquals("Even and Divisible by 10", getSumOfTwoIsEvenAndDivisibleByTen(-12, -8));
        assertEquals("Even and Divisible by 10", getSumOfTwoIsEvenAndDivisibleByTen(0, 0));

        assertEquals("Even but not Divisible by 10", getSumOfTwoIsEvenAndDivisibleByTen(2, 2));
        assertEquals("Even but not Divisible by 10", getSumOfTwoIsEvenAndDivisibleByTen(-5, -1));

        assertEquals("Odd", getSumOfTwoIsEvenAndDivisibleByTen(6, 3));
        assertEquals("Odd", getSumOfTwoIsEvenAndDivisibleByTen(-4, -3));
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

    @Test
    public void testGetSumOrMultiplication() {
        assertEquals(getSumOrMultiplication(3, 9), 12);
        assertEquals(getSumOrMultiplication(3, 10), 100);
        assertEquals(getSumOrMultiplication(-9, 3), -6);
        assertEquals(getSumOrMultiplication(12, -4), 16);
        assertEquals(getSumOrMultiplication(10, 3), 9);
        assertNull(getSumOrMultiplication(2, 4));

        assertEquals(getSumOrMultiplication(0, 0), 0);
        assertEquals(getSumOrMultiplication(0, 5), 25);
        assertEquals(getSumOrMultiplication(7, 0), 0);
    }

    @Test
    public void testGetAgeCategory() {
        assertEquals("Child", getAgeCategory(1));
        assertEquals("Child", getAgeCategory(11));
        assertEquals("Child", getAgeCategory(12));

        assertEquals("Teenager", getAgeCategory(13));
        assertEquals("Teenager", getAgeCategory(14));
        assertEquals("Teenager", getAgeCategory(16));
        assertEquals("Teenager", getAgeCategory(17));

        assertEquals("Adult", getAgeCategory(18));
        assertEquals("Adult", getAgeCategory(19));
        assertEquals("Adult", getAgeCategory(63));
        assertEquals("Adult", getAgeCategory(64));

        assertEquals("Senior", getAgeCategory(65));
        assertEquals("Senior", getAgeCategory(66));

        assertEquals("Invalid age", getAgeCategory(0));
        assertEquals("Invalid age", getAgeCategory(-1));
    }

    @Test
    public void testIsDivisibleWithResidualValue() {
        assertTrue(isDivisibleWithResidualValue(8, 3)); //2
        assertTrue(isDivisibleWithResidualValue(11, 3)); //2

        assertFalse(isDivisibleWithResidualValue(7, 3)); //1
        assertFalse(isDivisibleWithResidualValue(14, 5)); //4
    }
}
