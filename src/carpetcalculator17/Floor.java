package carpetcalculator17;

public class Floor {

    double width, length;//declaring two instance variables

    public Floor(double width, double length) {//constructor to initialise
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;//if width less than 0 then set 0
    }

    public double getArea() {
        return (this.width * this.length);//method to calculate area
    }
}
