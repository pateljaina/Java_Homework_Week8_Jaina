package cylinder19;

public class Circle {
    double radius;//instance variable

    public Circle(double radius) {//constructor to initialise
        this.radius = radius;
        this.radius = radius < 0 ? 0 : radius;
    }
    public double getRadius() {
        return radius;
    }//method to get Radius
    public double getArea(){//method to get Area

        return radius * radius * Math.PI;//using Math.PI constant
    }

}
