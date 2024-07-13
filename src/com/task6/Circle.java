package com.task6;

public class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Single-argument constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle1 circumference: " + circle1.getCircumference());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle2 circumference: " + circle2.getCircumference());
    }
}


