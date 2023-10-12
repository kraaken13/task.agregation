package com.tasks.task7;

import java.awt.*;

import static com.tasks.task7.Triangle.createTriangle;

public class Main {
    public static void main(String[] args) {
        Point vertexA = new Point(0, 0);
        Point vertexB = new Point(0, 4);
        Point vertexC = new Point(3, 0);

        Triangle triangle = createTriangle(vertexA, vertexB, vertexC);

        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        Point centroid = triangle.calculateCentroid();
        System.out.println("Centroid: (" + centroid.getX() + ", " + centroid.getY() + ")");
    }
}


