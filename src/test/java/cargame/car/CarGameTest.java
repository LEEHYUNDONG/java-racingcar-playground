package cargame.car;

import org.junit.jupiter.api.Test;

public class CarGameTest {

    @Test
    void playGame() {
        RacingGame racingGame = new RacingGame(new Referee());

        racingGame.getReferee().setCarList("pobi,crong,honux");
        racingGame.startGame();

    }

}
