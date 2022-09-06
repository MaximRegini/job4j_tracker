package ru.job4j.oop;

public class BallStory_Kolobok {
    public static void main(String[] args) {
        Hare_Kolobok hare = new Hare_Kolobok();
        Wolf_Kolobok wolf = new Wolf_Kolobok();
        Fox_Kolobok fox = new Fox_Kolobok();
        Ball_Kolobok ball = new Ball_Kolobok();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
