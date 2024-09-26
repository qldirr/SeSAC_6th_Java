package _04_exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionPractice {
    public static void main(String[] args) {
        int[] intArray = new int[4];

        for (int i = 0; i < intArray.length; i++ ){
            intArray[i] = i;
        }

        for (int i = 0; i < 5; i++){
            try {
                System.out.println("index "+i+": " + intArray[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스가 범위를 벗어남");
            }
        }
    }
}
