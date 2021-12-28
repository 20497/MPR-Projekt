package pizzeria.pjatk7.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizzeria.pjatk7.service.PizzaService;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("/pizza")
public class PizzaRestController {
    private final PizzaService pizzaService;

    public PizzaRestController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/toppings")
    public ResponseEntity<String> getToppings()
    {
        return ResponseEntity.ok(pizzaService.GetListOfToppings());
    }
}
