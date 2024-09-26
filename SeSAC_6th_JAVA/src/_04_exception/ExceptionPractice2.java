package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        // 사용자로부터 배열 크기를 입력받음
        while (true) {
            try {
                System.out.print("배열의 크기를 입력하세요: ");
                size = scanner.nextInt();

                // 배열 크기가 0 이하인 경우 예외 처리
                if (size <= 0) {
                    throw new IllegalArgumentException("배열의 크기는 1 이상의 정수여야 합니다.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해야 합니다.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // 크기에 맞는 배열을 생성
        double[] array = new double[size];

        // 배열 요소를 입력
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("배열의 " + (i + 1) + "번째 요소를 입력하세요: ");
                    array[i] = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자를 입력해야 합니다.");
                    scanner.next();
                }
            }
        }

        // 평균을 계산
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        // 평균을 출력
        System.out.println("배열 요소의 평균: " + average);

        scanner.close();
    }
}
