package cargame.v2.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    public void setUp() {
        cars = new Cars(Arrays.asList(new Car("lee"), new Car("steve")));
    }

    @Test
    void createCars() {
        assertThat(cars.equals(new Cars(Arrays.asList(new Car("lee"), new Car("steve"))))).isTrue();
    }

    @Test
    void moveAndCheckPos() {
        cars.move("lee", 3);
        cars.move("lee", 5);
        assertThat(cars.getPosition("lee").equals(new Position(1)));
    }

}
