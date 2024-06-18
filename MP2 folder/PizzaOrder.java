/**
 * @author Neal Aicinena
 * @version 1.0
 */
public class PizzaOrder {

    private Pizza[] m_order;
    private int m_numPizzas;
    private int m_currentPizzaTotal;

    /**Default Constructor
     * creates pizza array with just one medium cheese pizza object
     */
    public PizzaOrder() {
        m_order = new Pizza[1]; // order is just 1 pizza
        Pizza pizza = new Pizza(); // creating the default pizza
        m_order[0] = pizza; // puts pizza in the order array
        m_numPizzas = 1; // total pizza spots
        m_currentPizzaTotal = 1; // total pizzas currently in the order
    }

    /**Overloaded Constructor
     * creates pizza array of the size that is entered as a parameter
     * @param m_numPizzas number of pizzas in the order
     */
    public PizzaOrder(int m_numPizzas) {
        // adds as many pizzas as input by parameter
        m_order = new Pizza[m_numPizzas];
        this.m_numPizzas = m_numPizzas; // pizza order size equals the parameter
        m_currentPizzaTotal = 0; // total number of pizzas in the order
    }

    /** Adds a pizza to the pizza array of there is enough size
     * @return int
     * -1 if pizza could not add
     * 1 if pizza successfully added
     */
    public int addPizza(Pizza pizza) {
        // if there is still space in the order
        if(m_currentPizzaTotal < m_order.length) {
            // adds pizza to open spot
            m_order[m_currentPizzaTotal] = pizza; // adding a pizza to the order
            m_currentPizzaTotal++; // increases the count
            return 1; // returns one to let user know adding was successful
        } else {
            return -1; // returns negative one to let the user know the adding was not successful
        }
    }

    /** Totals the cost of the order between all the pizzas 
     * @return double of order total
    */
    public double calcTotal() {
        double sum = 0;
        for(Object o : m_order) { // goes through every pizza of the order
            if(o instanceof Pizza) {
                Pizza pizza = (Pizza) o;
                sum += pizza.calcCost(); // add the cost of the pizza to the total
            }
        }
        return sum; // return total cost
    }

    /** Returns all info on the order
     * @return String of all pizzas and the total price
     */
    public String toString() {
        String result = "";
        int i = 0;
        for(Pizza pizza : m_order) { // goes through each pizza in the order
            i++;
            result += "Pizza #" + i + ":\n" + pizza.toString() + "\n"; // adds info of pizza to the final info
        }
        result += "Total Pice: " + calcTotal(); // returns the total price as well
        return result; // returns info on every pizza on whole order
    }
}