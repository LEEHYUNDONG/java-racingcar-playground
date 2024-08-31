package cargame.v2.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    private Cars cars;
    private Referee referee;

    @BeforeEach
    void setup() {
        cars = new Cars(Arrays.asList(new Car("lee"), new Car("ding"), new Car("dong")));
        referee = new Referee(cars);
    }

    @Test
    void startGame() {
        assertThat(referee.startGameComment()).isEqualTo("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    @Test
    void getWinner() {
    }

}
