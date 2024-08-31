package cargame.v2.domain;

import cargame.v1.utils.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;


    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void move(String carName, int randomNo) {
        for (Car car : cars) {
            if (isRightCarToMove(carName, car)){
                car.move(randomNo);
                break;
            }
        }
    }

    private static boolean isRightCarToMove(String carName, Car car) {
        if(car.isSameName(carName)){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    public Optional<Position> getPosition(String name) {
        return cars.stream().filter(c -> c.isSameName(name)).map(Car::getPosition).collect(Collectors.toList()).stream().findFirst();
    }
}
