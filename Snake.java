package snakegame;

import java.awt.Color;
import java.awt.Graphics;

public class Snake {
    private int[] x;
    private int[] y;
    private int bodyParts;
    private final int UNIT_SIZE;

    public Snake(int unitSize) {
        this.UNIT_SIZE = unitSize;
        this.x = new int[600]; // 600 unités de jeu max
        this.y = new int[600];
        this.bodyParts = 6; // Nombre initial de segments du serpent
    }

    public void move(char direction) {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        // Déplacer la tête du serpent
        switch (direction) {
            case 'U': y[0] = y[0] - UNIT_SIZE; break;
            case 'D': y[0] = y[0] + UNIT_SIZE; break;
            case 'L': x[0] = x[0] - UNIT_SIZE; break;
            case 'R': x[0] = x[0] + UNIT_SIZE; break;
        }
    }

    public void grow() {
        bodyParts++;
    }

    public void draw(Graphics g) {
        for (int i = 0; i < bodyParts; i++) {
            if (i == 0) {
                g.setColor(Color.GREEN); // La tête du serpent est verte
            } else {
                g.setColor(new Color(45, 180, 0)); // Le corps est de couleur plus claire
            }
            g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
        }
    }

    public int getX(int index) {
        return x[index];
    }

    public int getY(int index) {
        return y[index];
    }

    public int getBodyParts() {
        return bodyParts;
    }

    public boolean collidesWithWall(int width, int height) {
        // Si la tête du serpent touche un mur
        return x[0] < 0 || x[0] >= width || y[0] < 0 || y[0] >= height;
    }

    public boolean collidesWithSelf() {
        // Si la tête du serpent touche son propre corps
        for (int i = 1; i < bodyParts; i++) {
            if (x[0] == x[i] && y[0] == y[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean eatsApple(Apple apple) {
        // Si la tête du serpent touche la pomme
        return x[0] == apple.getX() && y[0] == apple.getY();
    }
}
