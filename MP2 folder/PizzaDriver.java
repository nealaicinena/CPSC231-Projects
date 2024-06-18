public class PizzaDriver {
    public static void main(String[] args) {
        // creates 4 pizzas
        // final 2 are copies of first 2 pizzas
        Pizza pizza1 = new Pizza("small", 1, 0, 1);
        Pizza pizza2 = new Pizza("large", 2, 2, 0);
        Pizza pizza3 = new Pizza(pizza1);
        Pizza pizza4 = new Pizza(pizza2);

        // creates a new order with space for 3 pizzas
        PizzaOrder order = new PizzaOrder(3);

        // attempts to add 4 pizzas
        System.out.println(order.addPizza(pizza1));
        System.out.println(order.addPizza(pizza2));
        System.out.println(order.addPizza(pizza3));
        System.out.println(order.addPizza(pizza4)); // 4th one will fail

        System.out.println(pizza1.equals(pizza3)); // test if these pizzas are the same

        System.out.println(order); // print the whole order
    }
}