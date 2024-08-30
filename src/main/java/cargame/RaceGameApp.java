package cargame;

import cargame.car.RacingGame;
import cargame.car.Referee;
import cargame.utils.RandomNumberGenerator;

/**
 * @author : lhd
 * @packageName : cargame
 * @fileName : java-racingcar-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-29         lhd
 */
public class RaceGameApp {
    public static void main(String[] args) {
        RacingGame raceGame = new RacingGame(new Referee());
        raceGame.startGame();
        raceGame.printResult();
    }
}
