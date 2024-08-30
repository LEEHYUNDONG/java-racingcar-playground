package cargame.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void getStart() {
        assertThat(referee.startGame()).isEqualTo("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    @Test
    void getCars() {
        referee.setCarList("pobi,crong,honux");
        assertThat(referee.getOwnerList()).isEqualTo(Arrays.asList("pobi", "crong", "honux"));
    }

    @Test
    void getOwnerList() {
        referee.setCarList("pobi,crong,honux");
        assertThat(referee.getOwnerList()).isEqualTo(Arrays.asList("pobi", "crong", "honux"));
    }

    @Test
    void getWinnerList() {
        referee.setCarList("pobi,crong,honux");
        referee.getCars().get(0).carMoveWhenNumIsBiggerThanThree(5);
        referee.getCars().get(1).carMoveWhenNumIsBiggerThanThree(5);
        assertThat(referee.getWinnerList()).isEqualTo(Arrays.asList("pobi", "crong"));
    }


}
