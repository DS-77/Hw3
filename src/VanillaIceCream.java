/**
 * Description: This program implements the Decorator Design Pattern to create Ice Cream and Topping.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 16 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public class VanillaIceCream extends IceCream{
    /**
     * This method is the default constructor for the VanillaIceCream class.
     */
    public VanillaIceCream() {
        description = "Vanilla Ice Cream";
    }

    /**
     * This method prints out the double cost value.
     * @return a double value that represents the VanillaIceCream object's cost.
     */
    @Override
    public double getCost() {
        return 0.75;
    }
}
