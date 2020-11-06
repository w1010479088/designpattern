package calculator;

import calculator.impl.AddImpl;
import calculator.impl.DiviImpl;
import calculator.impl.MinusImpl;
import calculator.impl.MultiImpl;
import utils.TextUtils;

public enum CalculateType {
    Add("+", AddImpl.class),
    Min("-", MinusImpl.class),
    Multi("*", MultiImpl.class),
    Divider("/", DiviImpl.class);

    private String type;
    private Class<? extends ICalculate> clazz;

    CalculateType(String type, Class<? extends ICalculate> clazz) {
        this.type = type;
        this.clazz = clazz;
    }

    public static ICalculate parse(String type) {
        CalculateType findType = null;
        for (CalculateType item : CalculateType.values()) {
            if (TextUtils.equals(item.type, type)) {
                findType = item;
                break;
            }
        }
        if (findType == null) {
            throw new RuntimeException("算法不正确");
        }
        Class<? extends ICalculate> clazz = findType.clazz;
        try {
            return clazz.newInstance();
        } catch (Exception ex) {
            return null;
        }
    }
}
