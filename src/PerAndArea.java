/*
Ryan Chien
Period 4
Class Design
PerAndArea
 */

public class PerAndArea {
    // initiate variables
    private double length;
    private double width;
    private double radius;
    private int sides;

    // circle constructor
    public PerAndArea(double length, double width, double radius, int sides) {
        this.length = length;
        this.width = width;
        this.radius = radius;
        this.sides = sides;
    }

    // setter setLength
    public void setLength(double length) {
        this.length = length;
    }

    // setter setWidth
    public void setWidth(double width) {
        this.width = width;
    }

    // setter setSides
    public void setSides(int sides) {
        this.sides = sides;
    }

    // setter setRadius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getter getLength
    public double getLength() {
        return length;
    }

    // getter getWidth
    public double getWidth() {
        return width;
    }

    // getter getSides
    public int getSides() {
        return sides;
    }

    // getter getRadius
    public double getRadius() {
        return radius;
    }

    // getter areaRec
    public double areaRec() {
        return width * length;
    }

    // getter perRec
    public double perRec() {
        return width * 2 + length * 2;
    }

    // getter areaCircle
    public double areaCircle() {
        return radius * radius * Math.PI;
    }

    // getter circumCircle
    public double circumCircle() {
        return 2 * Math.PI * radius;
    }

    // getter areaPoly
    public double areaPoly() {
        double angle = Math.toRadians(180.0/sides);
        double apothem = 1 / (2 * Math.tan(angle));
        return (sides * length * apothem) / 2;
    }

    // getter perPoly
    public double perPoly() {
        return sides * length;
    }
}
