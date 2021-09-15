package com.company;

public class Game {
    private Integer ballCount;
    private Integer yellowCards;
    private Integer offsideCount;

    public void start() {
        Thread team1 = new Team();
        Thread team2 = new Team();

        team1.start();
        team2.start();

        try {
            team2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (((Team) team1).getBallCount() > ((Team) team2).getBallCount()) {
            System.out.println("Выйграла команда 1 со счетом: " + ((Team) team1).getBallCount() + ":" + ((Team) team2).getBallCount());
            System.out.println("команда 1 заработала " + ((Team) team1).getYellowCards() + " карточек");
        }
        else if (((Team) team1).getBallCount() < ((Team) team2).getBallCount()){
            System.out.println("Выйграла команда 2 со счетом: " + ((Team) team2).getBallCount() + ":" + ((Team) team1).getBallCount());
            System.out.println("команда 2 заработала " + ((Team) team2).getYellowCards() + " карточек");
        }
        else
            System.out.println("Ничья");


    }

    public Game() {
    }

    public Game(int ballCount, int yellowCards, int offsideCount) {
        this.ballCount = ballCount;
        this.yellowCards = yellowCards;
        this.offsideCount = offsideCount;
    }

    public Integer getBallCount() {
        return ballCount;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public Integer getOffsideCount() {
        return offsideCount;
    }
}