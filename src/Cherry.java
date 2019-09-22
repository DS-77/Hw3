public class Cherry extends ToppingsDecorator {
    private IceCream iceCream;

    public Cherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String toString() {
        return iceCream.toString() + " + a cherry on top";
    }

    public double getCost() {
        return iceCream.getCost() + 0.4;
    }
}
