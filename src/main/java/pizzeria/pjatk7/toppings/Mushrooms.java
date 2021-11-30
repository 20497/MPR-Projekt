package pizzeria.pjatk7.toppings;

import pizzeria.pjatk7.enums.Size;
import pizzeria.pjatk7.interfaces.IToppings;

public class Mushrooms implements IToppings {
    @Override
    public Double toppingPrice(Size pizzaSize) {
        if(pizzaSize.equals(Size.SMALL))
            return 1d;
        if(pizzaSize.equals(Size.NORMAL))
            return 2d;
        if(pizzaSize.equals(Size.BIG))
            return 4d;
        else
            return 7d;
    }
}