package discount.impl;

import discount.IDiscount;

public class StrategyNone implements IDiscount {
    @Override
    public double discount(double price) {
        return price;
    }
}
