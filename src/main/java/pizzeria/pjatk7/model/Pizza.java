package pizzeria.pjatk7.model;

import pizzeria.pjatk7.enums.Size;

import java.util.List;

public class Pizza {

    private Integer id;
    private String name;
    private Double basePrice;
    private List<Toppings> toppings;
    private Size size;

    public Pizza(){

    }

    public Pizza(Integer id, String name, Double basePrice, List<Toppings> toppings, Size size){
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", toppings=" + toppings +
                ", size=" + size +
                '}';
    }
}
