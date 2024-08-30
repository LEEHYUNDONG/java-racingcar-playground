package cargame.car;

import cargame.utils.RandomNumberGenerator;

import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * @author : lhd
 * @packageName : cargame.car
 * @fileName : java-racingcar-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-30         lhd
 */
public class RacingGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String WINNER_COMMENT = "가 최종 우승했습니다.";
    private static final String GAMESET_MESSAGE = "시도할 회수는 몇회인가요?";

    private Referee referee;
    private int gameSets;

    public RacingGame(Referee referee) {
        this.referee = referee;
    }

    public Referee getReferee() {
        return referee;
    }

    public void startGame() {
        // 심판역할
        refereePrepareGame();
        setGameSets();
        playGame();
    }

    private void refereePrepareGame() {
        System.out.println(referee.startGame());
        // 플레이어 세팅
        referee.setCarList(scanner.nextLine());
    }

    private void setGameSets() {
        // 게임 횟수 입력
        
        System.out.println(GAMESET_MESSAGE);
        gameSets = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }

    private void playGame() {
        // 게임 시작
        for (int i = 0; i < gameSets; i++) {
            for (Car car : referee.getCars()) {
                car.carMoveWhenNumIsBiggerThanThree(RandomNumberGenerator.genereateNumber());
                System.out.println(car.getOwner() + " : " + car.printCurrentLocation());
            }
            System.out.println();
        }
    }

    public void printResult() {

        System.out.println(String.join(", ", referee.getWinnerList()) + WINNER_COMMENT);
    }
}
