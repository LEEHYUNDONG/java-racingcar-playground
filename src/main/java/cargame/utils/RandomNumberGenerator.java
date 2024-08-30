package cargame.utils;

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
    private static final int MAX_BOUND = 10;
    private static Random random;

    public static int genereateNumber() {
        random = new Random();
        random.setSeed(System.nanoTime());
        return random.nextInt(MAX_BOUND);
    }
}
