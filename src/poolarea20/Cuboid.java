package poolarea20;

public class Cuboid extends Rectangle {double height;//extends rectangle class

    public Cuboid(double width, double length, double height) {//3 parameter constructor, call parent constructor
        super(width, length);
        this.height = height < 0 ? 0: height;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }//instance methods

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()* height;
    }
}
