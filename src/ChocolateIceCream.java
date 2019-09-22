/**
 * Description: This program implements the Decorator Design Pattern to create Ice Cream and Topping.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 16 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public class ChocolateIceCream extends IceCream {

    public ChocolateIceCream() {
        description = "Chocolate Ice Cream";
    }

    @Override
    public double getCost() {
        return 0.9;
    }
}
