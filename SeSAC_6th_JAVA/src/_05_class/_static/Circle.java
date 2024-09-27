package _05_class._static;

import java.util.Scanner;

public class Circle {
    final double radius;
    public static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculagteArea() {
        System.out.println("원의 반지름 : " + this.radius);
        System.out.println("원의 넓이 : " + (this.PI * (this.radius * this.radius)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원의 반지름 입력 : ");
        int radius = sc.nextInt();

        Circle c1 = new Circle(radius);
        c1.calculagteArea();

        sc.close();
    }
}
