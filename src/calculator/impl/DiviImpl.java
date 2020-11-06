package calculator.impl;

import calculator.ICalculate;

public class DiviImpl implements ICalculate {
    @Override
    public double cal(double first, double second) {
        if (second == 0.0) {
            throw new RuntimeException("除数不能为0");
        } else {
            return first / second;
        }
    }
}
