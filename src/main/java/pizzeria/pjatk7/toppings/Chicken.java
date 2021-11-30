package pizzeria.pjatk7.toppings;

import pizzeria.pjatk7.enums.Size;
import pizzeria.pjatk7.interfaces.IToppings;

public class Chicken implements IToppings {
    @Override
    public Double toppingPrice(Size pizzaSize) {
        if(pizzaSize.equals(Size.SMALL))
            return 3d;
        if(pizzaSize.equals(Size.NORMAL))
            return 4d;
        if(pizzaSize.equals(Size.BIG))
            return 7d;
        else
            return 10d;
    }
}
