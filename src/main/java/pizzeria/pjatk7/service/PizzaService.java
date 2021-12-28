package pizzeria.pjatk7.service;

import org.springframework.stereotype.Service;
import pizzeria.pjatk7.enums.Toppings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PizzaService {
    private List<Toppings> toppings = new ArrayList<Toppings>(Arrays.asList(Toppings.values()));

    public String GetListOfToppings() {
        return Arrays.toString(toppings.toArray());
    }
}
