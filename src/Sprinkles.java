/**
 * Description: This program implements the Decorator Design Pattern to create Ice Cream and Topping.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 16 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public class Sprinkles extends ToppingsDecorator{
    private IceCream iceCream;

    public Sprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public String toString() {
        return iceCream.toString() + " + sprinkles";
    }

    public double getCost() {
        return iceCream.getCost() + 0.2;
    }
}