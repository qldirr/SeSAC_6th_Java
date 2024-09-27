package _05_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width) {
        this.width = width;
        count++;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rectangle> rect = new ArrayList<>();

        while (true) {
            System.out.println("사각형 가로:");
            int width = sc.nextInt();

            System.out.println("사각형 세로:");
            int height = sc.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            Rectangle rectangle = new Rectangle(width);
            rectangle.setHeight(height);
            rect.add(rectangle);
        }

        for (Rectangle rec : rect) {
            System.out.println("가로길이는 " + rec.getWidth());
            System.out.println("세로길이는 " + rec.getHeight());
            System.out.println("넓이는 " + rec.area());
            System.out.println("------------------------------------");
        }
        System.out.println("Rectangle 인스턴스 개수 : "+Rectangle.getCount());

        //
//        System.out.println("사각형 가로:");
//        int width = sc.nextInt();
//
//        System.out.println("사각형 세로:");
//        int height = sc.nextInt();
//
//        Rectangle rectangle = new Rectangle(width, height);
//
//        System.out.println("사각형 넓이 : "+rectangle.area());
//
//        sc.close();
    }
}
