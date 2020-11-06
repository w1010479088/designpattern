package calculator.impl;

import calculator.ICalculate;

public class MultiImpl implements ICalculate {
    @Override
    public double cal(double first, double second) {
        return first * second;
    }
}
