package cargame.utils;

import cargame.RaceGame;

import java.util.Random;

/**
 * @author : lhd
 * @packageName : cargame.utils
 * @fileName : java-racingcar-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-29         lhd
 */
public class RandomNumberGenerator {
    private static final Random random = new Random();

    private RandomNumberGenerator() {}

    public static int genereateNumber() {
        random.setSeed(System.currentTimeMillis());
        return random.nextInt(10);
    }
}
