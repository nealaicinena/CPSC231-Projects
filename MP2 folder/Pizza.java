/**
 * @author Neal Aicinena
 * @version 1.0
 */

/** Pizza Class
 * Represents a pizza size and its condiments
 * Toppings can be added or removed
*/
public class Pizza {
    
    private String m_size;
    private int m_cheese;
    private int m_pepperoni;
    private int m_veggie;

    /** Default Constructor
     * Creates a medium cheese pizza by default
     */
    public Pizza() {
        m_size = "medium";
        m_cheese = 1;
        m_pepperoni = 0;
        m_veggie = 0;
    }

    /** Overloaded Constructor
     * @param m_size size of the pizza
     * @param m_cheese number of cheese toppings
     * @param m_pepperoni number of pepperoni toppings
     * @param m_veggie number of veggie toppings
     */
    public Pizza(String m_size, int m_cheese, int m_pepperoni, int m_veggie) {
        this.m_size = m_size;
        this.m_cheese = m_cheese;
        this.m_pepperoni = m_pepperoni;
        this.m_veggie = m_veggie;
    }

    /** Copy Constructor creates duplicate object of the given pizza
     * @param bookToCopy the pizza object you'd like to duplicate
     */
    public Pizza(Pizza pizzaToCopy) {
        this.m_size = pizzaToCopy.m_size;
        this.m_cheese = pizzaToCopy.m_cheese;
        this.m_pepperoni = pizzaToCopy.m_pepperoni;
        this.m_veggie = pizzaToCopy.m_veggie;
    }
    
    /** Changes the size of the pizza
     * @param m_size
     */
    public void getSize(String m_size) {
        this.m_size = m_size;
    }

    /** Changes the number of cheese toppings of the pizza
     * @param m_cheese
     */
    public void getCheese(int m_cheese) {
        this.m_cheese = m_cheese;
    }

    /** Changes the number of pepperoni toppings of the pizza
     * @param m_pepperoni
     */
    public void getPepperoni(int m_pepperoni) {
        this.m_pepperoni = m_pepperoni;
    }

    /** Changes the number of veggie toppings of the pizza
     * @param m_veggie
     */
    public void getVeggie(int m_veggie) {
        this.m_veggie = m_veggie;
    }
    
    /** Returns the number size of the pizza
     * @return String of size
     */
    public String getSize() {
        return this.m_size;
    }

    /** Returns the number number of cheese toppings of the pizza
     * @return int of cheese toppings
     */
    public int getCheese() {
        return this.m_cheese;
    }

    /** Returns the number number of cheese toppings of the pizza
     * @return int of pepperoni toppings
     */
    public int getPepperoni() {
        return this.m_pepperoni;
    }

    /** Returns the number number of cheese toppings of the pizza
     * @return int of veggie toppings
     */
    public int getVeggie() {
        return this.m_veggie;
    }

    /** Calculates cost of the pizza
     * Small = $10
     * Medium = $12
     * Large = $14 
     * Each topping is an additional 2$
     */
    public double calcCost() {
        // finds size
        if(m_size.equals("small")) {
            return 10 + (m_cheese * 2) + (m_pepperoni * 2) + (m_veggie * 2); // add each toping amount
        } else if(m_size.equals("medium")) {
            return 12 + (m_cheese * 2) + (m_pepperoni * 2) + (m_veggie * 2); // add each toping amount
        } else if(m_size.equals("large")) {
            return 14 + (m_cheese * 2) + (m_pepperoni * 2) + (m_veggie * 2); // add each toping amount
        } else {
            return 0;
        }
    }

    /** Returns all info of the pizza (size and toppings)
     * @return String of info of the pizza
     */
    public String toString() {
        // returns all properties of the pizza
        return m_size + " pizza" +
        "\nCheese: " + m_cheese +
        "\nPepperoni: " + m_pepperoni +
        "\nVeggies: " + m_veggie +
        "\nCost: " + calcCost();
    }

    /** Tests to see if two pizza ojbects are the same
     * @param pizza
    */
    public boolean equals(Pizza pizza) {
        // return true if every property is the same otherwise false
        return pizza.m_size.equals(this.m_size)
        && pizza.m_cheese == this.m_cheese
        && pizza.m_pepperoni == this.m_pepperoni
        && pizza.m_veggie == this.m_veggie; 
    }
}