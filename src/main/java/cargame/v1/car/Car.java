package cargame.v1.car;

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
public class Car {
    private final String owner;
    private int location;

    public Car(String owner) {
        this.owner = owner;
        this.location = 0; // 위치 초기화
    }


    public String getOwner() {
        return owner;
    }

    public int getLocation() {
        return location;
    }

    public int carMoveWhenNumIsBiggerThanThree(int num) {
        if(num < 4){
            return location;
        }
        return ++location;
    }

    public int compareLocation(Car car) {
        return Comparator(this, car);
    }

    private static int Comparator(Car a, Car b) {
        if(a.getLocation() < b.getLocation()) {
            return 1;
        }
        return 0;
    }
}
