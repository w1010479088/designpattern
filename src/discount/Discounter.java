package discount;

import discount.impl.StrategyType;
import utils.LogUtil;

public class Discounter {
    public static void main(String[] args) {
        Discounter discounter = new Discounter("back");
        double result = discounter.discount(300);
        LogUtil.log(String.valueOf(result));
    }

    private IDiscount discount;

    public Discounter(String type) {
        discount = StrategyType.parse(type);
    }

    public double discount(double price) {
        return discount.discount(price);
    }
}
