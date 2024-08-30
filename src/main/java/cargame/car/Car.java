package cargame.car;

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
public class Car implements Movable {
    private static final int TARGET_NUM =4;
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

    public int compareLocation(Car car) {
        return Comparator(this, car);
    }

    private static int Comparator(Car a, Car b) {
        if (a.getLocation() < b.getLocation()) {
            return 1;
        }
        return 0;
    }

    public String printCurrentLocation() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < this.location; i++) {
            res.append("-");
        }
        return res.toString();
    }

    @Override
    public int move(int num) {
        if (num < TARGET_NUM) {
            return location;
        }
        return ++location;
    }
}
