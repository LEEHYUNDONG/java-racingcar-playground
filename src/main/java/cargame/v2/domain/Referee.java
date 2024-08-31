package cargame.v2.domain;

public class Referee {

    private final Cars cars;

    public Referee(Cars cars) {
        this.cars = cars;
    }

    public String startGameComment() {
        return "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    }
}
