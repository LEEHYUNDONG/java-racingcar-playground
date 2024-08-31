package cargame.v2.domain;

import java.util.Objects;

public class Car {
    private static final int MOVE_WHEN_BIGGER_THAN = 3;

    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        this.position = new Position(0);
    }

    public void move(int randomNum) {
        if (isBiggerThan(randomNum)) {
            position.move();
        }
    }

    private boolean isBiggerThan(int randomNum) {
        return randomNum > MOVE_WHEN_BIGGER_THAN;
    }

    public Position getPosition(){
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    public boolean isSameName(String carName) {
        return this.name.equals(carName);
    }
}
