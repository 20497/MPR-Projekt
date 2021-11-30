package pizzeria.pjatk7.toppings;

import pizzeria.pjatk7.enums.Size;
import pizzeria.pjatk7.interfaces.IToppings;

public class Tuna implements IToppings {
    @Override
    public Double toppingPrice(Size pizzaSize) {
        if(pizzaSize.equals(Size.SMALL))
            return 4d;
        if(pizzaSize.equals(Size.NORMAL))
            return 5d;
        if(pizzaSize.equals(Size.BIG))
            return 7d;
        else
            return 10d;
    }
}
