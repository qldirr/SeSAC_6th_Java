package _05_class._static;

import _05_class._final.Const;

public class CalculatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double circleArea = 10 * 10 * Calculator.pi;
        int plusResult = Calculator.plus(num1, num2);
        int minusResult = Calculator.minus(num1, num2);

        System.out.println(circleArea);
        System.out.println(plusResult);
        System.out.println(minusResult);

        // 상수 읽기
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);

        // 상수는 값을 변경할 수 없어야함
//        Const.GREETING = "Hi";
//        Const.MAX_VALUE = 10;
    }
}
