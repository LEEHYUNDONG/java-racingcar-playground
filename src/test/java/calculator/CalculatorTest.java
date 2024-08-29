package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author : lhd
 * @packageName : calculator
 * @fileName : java-racingcar-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-29         lhd
 */
public class CalculatorTest {

    @Test
    void splitAndSum() {
        int result = Calculator.splitAndSum("1:2,4");
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void splitAndSum_숫자하나() throws Exception {
        int result = Calculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }


    @Test
    void isEmpty(){
        boolean result = Calculator.isEmpty("");
        assertThat(result).isTrue();
    }

    @Test
    void containsNegativeNumber() {
        assertThatThrownBy(() -> {
            Calculator.splitAndSum("-1,2,3");
        }).isInstanceOf(RuntimeException.class);
    }
}
