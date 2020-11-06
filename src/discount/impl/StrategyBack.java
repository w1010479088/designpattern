package discount.impl;

import discount.IDiscount;

public class StrategyBack implements IDiscount {
    private static final double GAP = 300;
    private static final double BACK = 100;

    @Override
    public double discount(double price) {
        return price - ((int) (price / GAP)) * BACK;
    }
}
