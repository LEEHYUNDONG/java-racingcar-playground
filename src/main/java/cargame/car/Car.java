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
public class Car {
    private final String userName;
    private int location;

    public Car(String userName) {
        this.userName = userName;
        this.location = 0; // 위치 초기화

    }


    public String getUserName() {
        return userName;
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
}
