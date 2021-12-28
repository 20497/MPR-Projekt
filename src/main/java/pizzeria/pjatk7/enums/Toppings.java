package pizzeria.pjatk7.enums;

public enum Toppings {
    CHICKEN(4, 6, 11, 15),
    BACON(4, 6, 11, 15),
    SALAMI(4,6,11, 15),
    TUNA(4,6,11, 15),
    HAM(3, 5, 10, 14),
    OLIVES(3,5,8, 12),
    PEPPERS(3, 5, 8, 12),
    MUSHROOMS(2,4,7, 11),
    ONION(2,4,8, 12),
    TOMATOES(2,4,8, 11);
    private final int smallPrice;
    private final int normalPrice;
    private final int bigPrice;
    private final int partyPrice;

    Toppings(int smallPrice, int mediumPrice, int bigPrice, int partyPrice) {
        this.smallPrice = smallPrice;
        this.normalPrice = mediumPrice;
        this.bigPrice = bigPrice;
        this.partyPrice = partyPrice;
    }

    public int getSmallPrice() {
        return smallPrice;
    }

    public int getMediumPrice() {
        return normalPrice;
    }

    public int getBigPrice() {
        return bigPrice;
    }

    public int getPartyPrice() {
        return partyPrice;
    }
}
