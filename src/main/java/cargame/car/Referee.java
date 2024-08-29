package cargame.car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Referee {

    private List<Car> cars;

    public String startGame() {
        return "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    }

    public void setCarList(String owners) {
        cars = Arrays.stream(owners.split(",")).map(Car::new).collect(Collectors.toList());
    }

    public List<String> getOwnerList(){
        return cars.stream().map(Car::getOwner).collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getWinnerList() {
        Optional<Integer> max = cars.stream().max(Car::compareLocation).map(Car::getLocation);
        return cars.stream().filter(m -> m.getLocation()==max.get()).map(Car::getOwner).collect(Collectors.toList());
    }

}
