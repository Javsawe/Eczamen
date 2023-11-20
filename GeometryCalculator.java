package Zadacha3;

import java.util.concurrent.Callable;

public class GeometryCalculator {
    public static void main(String[] args) {
        String Rectangle;
        Rectangle rectangle = new Rectangle();
        rectangle.calculateAreaRectangle();
        System.out.println("Площадь прямоугольника: " + rectangle);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.calculatePerimeterRectang();
        System.out.println("Периметр прямоуголника: " + rectangle1);

        String Triangle;
        Triangle triangle = new Triangle();
        triangle.calculateAreaTriang();
        System.out.println("Площадь треуголника: " + triangle);

        Triangle triangle1 = new Triangle();
        triangle1.calculatePerimeterTriang();
        System.out.println("Периметр треуголника: " + triangle1);

        String Circle;
        Circle circle = new Circle();
        circle.calculateAreaCircle();
        System.out.println("Площадь круга: " + circle);

        Circle circle1 = new Circle();
        circle1.calculatePerimeterCircle();
        System.out.println("Периметр круга: " + circle1);
    }
}
