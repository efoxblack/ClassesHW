package guessinggame;

public class Player {
    public Integer number = 0;

    public Player() {

    }

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
