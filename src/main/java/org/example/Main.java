package org.example;

public class Main {
    public static void main(String[] args) {
        sqrt(-5);
    }

    public static double sqrt(double x) throws IllegalArgumentException{
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}