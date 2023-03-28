package poolarea20;

public class Rectangle {
    double width, length;//2 instance variables

    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getWidth() {
        return this.width;
    }//method to get width

    public double getLength() {
        return this.length;
    }//method to get length

    public double getArea() {
        return this.width * this.length;
    }// method to get area
}
