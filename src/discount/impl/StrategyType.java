package discount.impl;

import discount.IDiscount;
import utils.TextUtils;

public enum StrategyType {
    None("none", StrategyNone.class),
    Multi("multi", StrategyMulti.class),
    Back("back", StrategyBack.class);

    private String type;
    private Class<? extends IDiscount> clazz;

    StrategyType(String type, Class<? extends IDiscount> clazz) {
        this.type = type;
        this.clazz = clazz;
    }

    public static IDiscount parse(String type) {
        StrategyType discount = null;
        for (StrategyType item : StrategyType.values()) {
            if (TextUtils.equals(item.type, type)) {
                discount = item;
                break;
            }
        }
        if (discount == null) {
            discount = None;
        }
        try {
            return discount.clazz.newInstance();
        } catch (Exception ex) {
            return null;
        }
    }
}
