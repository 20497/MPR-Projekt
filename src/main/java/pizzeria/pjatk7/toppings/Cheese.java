package pizzeria.pjatk7.toppings;

import pizzeria.pjatk7.enums.Size;
import pizzeria.pjatk7.interfaces.IToppings;

public class Cheese implements IToppings {

    @Override
    public Double toppingPrice(Size pizzaSize) {
        return 2d;
    }
}
