public class PumpkinSpice extends CondimentDecorator {
    public PumpkinSpice(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Pumpkin Spice";
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }
}
