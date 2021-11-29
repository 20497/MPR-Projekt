package pizzeria.pjatk7.model;

import pizzeria.pjatk7.enums.Size;

import java.util.List;

public class Pizza {

    private Integer id;
    private String name;
    private Double basePrice;
    private List<Toppings> toppings;
    private Size size;
}
