package calculator;

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
public class Calculator {
    public static int splitAndSum(String s) {
        if(isEmpty(s)) {
            return 0;
        }

        return getResult(s.split("[,:]"));
    }

    private static int getResult(String[] data) {
        int result = 0;
        for (String datum : data) {
            int num = Integer.parseInt(datum);
            if(num < 0) throw new RuntimeException("음수는 계산할 수 없습니다");
            result += num;
        }
        return result;
    }

    public static boolean isEmpty(String exp) {
        return exp.isEmpty();
    }
}
