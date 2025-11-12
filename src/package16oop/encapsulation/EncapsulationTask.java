package package16oop.encapsulation;

public class EncapsulationTask {

    public static void main(String[] args) {

        /*
            Task: Pizza Class

            The "Pizza" class should have the following private variables:
                Size(String), Number of Cheese Toppings (int), Number of Pepperoni Toppings (int)

            Encapsulation:
                    Encapsulate all the fields, ensuring that the following conditions are met:
                        Size of the pizza can only be small, medium, or large (case-insensitive).
                        Number of cheese toppings and pepperoni toppings cannot be negative.

            Constructor:
                    Include a constructor that allows the user to set all the fields when the object is created,
                    If the provided arguments are not valid, the fields should not be set in the instances.

            Methods:
                    Implement the following methods in the "Pizza" class:
                    calcCost(): Returns the total cost of the pizza basen on its size and toppings.
                    toString(): Returns a string containing the pizza size, quantity of each topping, and the pizza
                                cost calculated by the calcCost() method.

            Calculate the pizza cost using the following formula:
                Small: $10 + $2 per topping.
                Medium: $12 + $2 per topping.
                Large: $14 + $2 per topping.
         */

        Pizza pizza = new Pizza("large",3,4);
        System.out.println(pizza);
        System.out.println(pizza.calcCost());

    }

}
