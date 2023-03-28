package carpetcalculator17;

public class Carpet {
    double cost;//variable

    public Carpet(double cost) {//constructor to initialise
        this.cost = cost < 0 ? 0 : cost;//if cost less than 0 then set to 0
    }
    public double getCost() {//method to get cost
        return cost;
    }
}



