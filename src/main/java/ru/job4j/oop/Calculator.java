package ru.job4j.oop;

public class Calculator {

    private static final int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int diff(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + diff(num) + divide(num);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int diffrsl = diff(10);
        int multiplyrsl = calculator.multiply(10);
        int dividersl = calculator.divide(10);
        int alloperrsl = calculator.sumAllOperation(10);
        System.out.println(diffrsl);
        System.out.println(multiplyrsl);
        System.out.println(dividersl);
        System.out.println(alloperrsl);
    }
}