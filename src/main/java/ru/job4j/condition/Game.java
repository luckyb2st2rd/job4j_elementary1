package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario.");
        } else if ("tanks".equals(name)) {
            System.out.println("Start - tanks.");
        } else if ("tetris".equals(name)) {
            System.out.println("Start - tetris.");
        } else {
            System.out.println("Not this game");
        }
    }

    public static void main(String[] args) {
        menu("super mario");
        menu("fifa26");
        menu("tanks");
        menu("pacman");
        menu("tetris");
    }
}
