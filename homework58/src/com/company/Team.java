package com.company;

import java.util.Random;

public class Team extends Thread {
    private volatile Integer ballCount;
    private volatile Integer yellowCards;
    private volatile Integer offsideCount;


    @Override
    public void run() {
        Random random = new Random();

        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                ballCount = random.nextInt(16);
            else if (i == 2)
                yellowCards = random.nextInt(16);
            else
                offsideCount = random.nextInt(16);
        }
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
