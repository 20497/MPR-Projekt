package pizzeria.pjatk7.toppings;

import pizzeria.pjatk7.enums.Size;
import pizzeria.pjatk7.interfaces.IToppings;

public class Olives implements IToppings {

    @Override
    public Double toppingPrice(Size pizzaSize) {
        if(pizzaSize.equals(Size.SMALL))
            return 2d;
        if(pizzaSize.equals(Size.NORMAL))
            return 3d;
        if(pizzaSize.equals(Size.BIG))
            return 5d;
        else
            return 8d;
    }
}
