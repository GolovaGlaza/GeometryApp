package org.example.app;

import org.example.geometry.*;


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(7, 8);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(8, 8, 8);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        Cube cube = new Cube(13);
        System.out.println("Объем куба: " + cube.getVolume());
        System.out.println("Площадь поверхности куба: " + cube.getSurfaceArea());


        //Сравнение площади круга и прямоугольника
        System.out.println(FigureCompare.compareByArea(circle.getArea(), rectangle.getArea()));

        //Сравнение периметра круга и треугольника
        System.out.println(FigureCompare.compareByPerimeter(circle.getPerimeter(), triangle.getPerimeter()));

    }
}

