/**
 * Description: This program implements the Decorator Design Pattern to create Ice Cream and Topping.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 16 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public abstract class IceCream {
    // Ice Cream Class properties.
    protected String description;

    /**
     * This method returns the string value stored in the class's "description" property.
     * @return a String value stored in "description" property.
     */
    public String toString() {
        return description;
    }

    /**
     * This method will be implemented by children subclasses.
     * @return a double value that reflects the cost of said class object.
     */
    public abstract double getCost();
}
