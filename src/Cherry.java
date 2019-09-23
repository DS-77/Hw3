/**
 * Description: This program implements the Decorator Design Pattern to create Ice Cream and Topping.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 16 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public class Cherry extends ToppingsDecorator {
    // Class properties.
    private IceCream iceCream;

    /**
     * This method is the default constructor for the Cherry Class.
     * @param iceCream is the IceCream object to be set as the "iceCream" property value.
     */
    public Cherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    /**
     * This method print the description of the IceCream object in addition to it's new topping.
     * @return a string value that represents the object's description.
     */
    @Override
    public String toString() {
        return iceCream.toString() + " + a cherry on top";
    }

    /**
     * This method prints the cost of the IceCream object with the addition of the Cherry object's
     * cost.
     * @return a double value that represents the object's cost.
     */
    public double getCost() {
        return iceCream.getCost() + 0.4;
    }
}
