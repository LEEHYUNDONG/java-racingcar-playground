package cargame.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
public class CarTest {
    private Car car;

    @BeforeEach
    void setup() {
        car = new Car("user");
    }

    @Test
    void carCreated() {
        assertThat(car.getUserName()).isEqualTo("user");
        assertThat(car.getLocation()).isEqualTo(0);
    }

    @Test
    void carMoveWhenNumIsBiggerThanThree_조건없이이동() {
        int times = 3; // 횟수와 위치는 같아야함.

        for (int i = 0; i < times; i++) {
            car.carMoveWhenNumIsBiggerThanThree(5);
        }
        assertThat(car.getLocation()).isEqualTo(3);
    }

    @Test
    void carMoveWhenNumIsBiggerThanThree_숫자_4미만() {
        assertThat(car.carMoveWhenNumIsBiggerThanThree(3)).isEqualTo(0);
    }
}
