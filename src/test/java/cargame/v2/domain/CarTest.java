package cargame.v2.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    void setup() {
        car = new Car("user1");
    }

    @Test
    void carCreate() {
        assertThat(car.equals(new Car("user1"))).isTrue();
    }

    @Test
    void carMoveWhenNumberIsBiggerThan4() {
        car.move(4);
        assertThat(car.getPosition().equals(new Position(1))).isTrue();
    }

}
