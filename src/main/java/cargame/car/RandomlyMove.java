package cargame.car;

/**
 * @author : lhd
 * @packageName : cargame.car
 * @fileName : java-racingcar-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-30         lhd
 */
public class RandomlyMove implements MovingStrategy{
    private static final int TARGET_NUM =4;

    @Override
    public boolean movable(int num) {
        return num > TARGET_NUM;
    }
}
