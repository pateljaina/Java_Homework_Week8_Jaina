package carpetcalculator17;
public class Calculator {
    Floor floor;//2 instance variables
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {//constructor to initialise
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {//total cost method
        return floor.getArea() * carpet.cost;
    }
}
