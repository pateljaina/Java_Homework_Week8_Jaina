package cylinder19;

public class Cylinder extends Circle {
    double height;//instance variable

    public Cylinder(double radius, double height) {//Constructor to initalise
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }//Get Height method without parameters

    public double getVolume() {
        return getArea() * height;
    }//Get volume without parameters,gives volume value
}


