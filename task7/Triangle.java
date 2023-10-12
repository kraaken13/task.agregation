package com.tasks.task7;

import java.awt.Point;

public class Triangle {
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    // Конструктор класса
    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    // Длина стороны
    private double calculateSideLength(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }

    // Периметр
    public double calculatePerimeter() {
        double sideAB = calculateSideLength(vertexA, vertexB);
        double sideBC = calculateSideLength(vertexB, vertexC);
        double sideCA = calculateSideLength(vertexC, vertexA);
        return sideAB + sideBC + sideCA;
    }

    // Метод для вычисления площади треугольника по формуле Герона
    public double calculateArea() {
        double sideAB = calculateSideLength(vertexA, vertexB);
        double sideBC = calculateSideLength(vertexB, vertexC);
        double sideCA = calculateSideLength(vertexC, vertexA);
        double s = calculatePerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }

    // Метод для вычисления точки пересечения медиан треугольника
    public Point calculateCentroid() {
        double centroidX = (vertexA.getX() + vertexB.getX() + vertexC.getX()) / 3;
        double centroidY = (vertexA.getY() + vertexB.getY() + vertexC.getY()) / 3;
        return new Point((int) centroidX, (int) centroidY);
    }

    // Метод для создания объекта треугольника
    public static Triangle createTriangle(Point vertexA, Point vertexB, Point vertexC) {
        return new Triangle(vertexA, vertexB, vertexC);
    }
}

