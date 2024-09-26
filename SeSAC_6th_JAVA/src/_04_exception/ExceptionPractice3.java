package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice3 {
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


    }
}
