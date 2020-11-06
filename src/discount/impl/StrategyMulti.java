package discount.impl;

import discount.IDiscount;

public class StrategyMulti implements IDiscount {
    private static final double DISCOUNT = 0.8;

    @Override
    public double discount(double price) {
        return price * DISCOUNT;
    }
}
