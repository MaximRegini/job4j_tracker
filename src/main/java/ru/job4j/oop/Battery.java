package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery charge = new Battery(70);
        Battery another = new Battery(30);
        charge.exchange(another);
        System.out.println(another.load);
    }
}

