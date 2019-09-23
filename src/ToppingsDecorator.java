/**
 * Description: This program implements the Decorator Design Pattern to create Ice Cream and Topping.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 16 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public abstract class ToppingsDecorator extends IceCream{
    /**
     * This method will be implemented by the subclasses.
     * @return a string value.
     */
    @Override
    public abstract String toString();
}
