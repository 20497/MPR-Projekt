package pizzeria.pjatk7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizzeria.pjatk7.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaRestController {
    private final PizzaService pizzaService;

    public PizzaRestController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }
}
