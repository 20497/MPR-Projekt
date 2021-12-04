package pizzeria.pjatk7.service;

import org.springframework.stereotype.Service;
import pizzeria.pjatk7.database.PizzaRepository;
import pizzeria.pjatk7.model.Pizza;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository)
    {
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza BasicPizza() {
        return null;
    }
}
