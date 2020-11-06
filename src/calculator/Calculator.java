package calculator;

import utils.LogUtil;

public class Calculator {
    public static void test() {
        double result = new Calculator().cal(1, 8.9, "-");
        LogUtil.log(String.valueOf(result));
    }

    public double cal(double first, double second, String type) {
        return CalculatorFactory.newInstance(type).cal(first, second);
    }
}
