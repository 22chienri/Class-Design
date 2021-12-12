/*
Ryan Chien
Period 4
Class Design
PerAndAreaDriver
 */

import java.util.Scanner;

public class PerAndAreaDriver {
    public static void main(String[] args) {
        // create scanner object to get user input
        Scanner input = new Scanner(System.in);
        // get selected shape
        System.out.println("1: Circle\n2: Rectangle\n3: Regular Polygon");
        int shape = Integer.parseInt(input.nextLine());

        // if circle
        if (shape == 1) {
            // get radius input
            System.out.println("Enter radius:");
            double radius = Double.parseDouble(input.nextLine());
            // create cirlce object
            PerAndArea circle = new PerAndArea(0, 0, radius, 0);
            System.out.printf("Area: %s\nCircumference: %s%n", circle.areaCircle(), circle.circumCircle());
            // calculate volume
            double volume = (4.0 / 3.0) * Math.PI * circle.getRadius() * circle.getRadius() * circle.getRadius();
            System.out.printf("Volume: %s%n", volume);
            // change values
            System.out.println("Setting radius to 12.5");
            circle.setRadius(12.5);
            // print again
            System.out.printf("Area: %s\nCircumference: %s%n", circle.areaCircle(), circle.circumCircle());
            double volume2 = (4.0 / 3.0) * Math.PI * circle.getRadius() * circle.getRadius() * circle.getRadius();
            System.out.printf("Volume: %s", volume2);
        }
        // if rectangle
        else if (shape == 2) {
            // get dimension input
            System.out.println("Enter length:");
            double length = Double.parseDouble(input.nextLine());
            System.out.println("Enter width:");
            double width = Double.parseDouble(input.nextLine());
            // create rectangle object
            PerAndArea rectangle = new PerAndArea(length, width, 0, 0);
            System.out.printf("Area: %s\nPerimeter: %s%n", rectangle.areaRec(), rectangle.perRec());
            // change values
            System.out.println("Setting length to 20.5 and width to 30.5");
            rectangle.setLength(20.5);
            rectangle.setWidth(30.5);
            // print again
            System.out.printf("Area: %s\nPerimeter: %s", rectangle.areaRec(), rectangle.perRec());
        }
        // if regular polygon
        else if (shape == 3) {
            // get dimension input
            System.out.println("Enter sides:");
            int sides = Integer.parseInt(input.nextLine());
            System.out.println("Enter length:");
            double length = Double.parseDouble(input.nextLine());
            // create polygon object
            PerAndArea polygon = new PerAndArea(length, 0, 0, sides);
            System.out.printf("Area: %s\nPerimeter: %s%n", polygon.areaPoly(), polygon.perPoly());
            // change values
            System.out.println("Setting sides to 4 and length to 20.5");
            polygon.setSides(4);
            polygon.setLength(20.5);
            // print again
            System.out.printf("Area: %s\nPerimeter: %s", polygon.areaPoly(), polygon.perPoly());
        }
    }
}
