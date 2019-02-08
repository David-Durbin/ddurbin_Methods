package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu()
    {
        // variables
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        // system prompts for data
        System.out.println("Area Calculator");
        System.out.println("Please select a shape from the menu: ");
        System.out.println("1. Rectangle, Square, Parallelogram");
        System.out.println("2. Triangle");
        System.out.println("3. Trapezoid");
        System.out.println("4. Circle");
        c = scanner.nextInt();
        switch (c)
        {
            case 1:
                rectangle();
                break;

            case 2:
                triangle();
                break;

            case 3:
                trapezoid();
                break;

            case 4:
                circle();
                break;

            default:
                clearDisplay();
                System.out.println("That wass not a valid selection. Please select a listed shape.");
                menu();
                break;
        }
    }

    // add 30 blank lines to clear display
    private static void clearDisplay()
    {
        for(int i = 0; i < 30; i++)
            System.out.println();
    }

    // get input & calculate area for rectangles squares parallelograms
    private static void rectangle()
    {
        int w = 0, h = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter the width or base of the shape: ");
        w = scanner.nextInt();
        System.out.printf("Please enter the height of the shape: ");
        h = scanner.nextInt();

        System.out.println("The area of the shape is: " + w + " * " + h + " = " + (w*h));
    }

    // get input and calculate area for triangles
    private static void triangle()
    {
        double b = 0, h = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter the measurement of the base of the triangle: ");
        b = scanner.nextDouble();
        System.out.printf("Please enter the vertical height of the triangle: ");
        h = scanner.nextDouble();

        System.out.println("The area of the triangle is: " + b + " * " + h + " * 0.5 = " + b * h * .5 );
    }

    // get input and calcaulate the area for trapezoids
    private static void trapezoid()
    {
        double a = 0, b = 0, h = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter the measurement for the top side of the trapezoid: ");
        a = scanner.nextDouble();
        System.out.printf("Please enter the measurement for the bottom side of the trapezoid: ");
        b = scanner.nextDouble();
        System.out.printf("Please enter the height of the trapezoid: ");
        h = scanner.nextDouble();

        System.out.println("The area of the trapezoid is: 0.5 * (" + a + " + " + b + ") * " + h + " = " +
                ((.5 * (a+b)) * h));
    }

    // get input and calculate the are for circles
    private static void circle()
    {
        double r = 0, pi = 3.14159265359;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter the radius of the circle: ");
        r = scanner.nextDouble();

        System.out.println("The area of the circle is: 3.14159 * " + r + "^2 = " + pi * (r*r));

    }
}