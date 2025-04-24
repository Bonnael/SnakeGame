package snakegame;

import java.util.Random;

public class Apple {

    private int x;
    private int y;
    private final int UNIT_SIZE;

    public Apple(int unitSize) {
        this.UNIT_SIZE = unitSize;
        newApple();
    }

    public void newApple() {
        Random random = new Random();
        x = random.nextInt(24) * UNIT_SIZE; // Taille de l'écran divisé par la taille de l'unité
        y = random.nextInt(24) * UNIT_SIZE;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
