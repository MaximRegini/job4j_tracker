package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error test = new Error();
        Error test1 = new Error(true, 1, "Love not found");
        Error test2 = new Error(false, 2, "Still alive");
        Error test3 = new Error(true, 3, "Help me");
        test.printInfo();
        test1.printInfo();
        test2.printInfo();
        test3.printInfo();
    }
}