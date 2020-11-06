package calculator;

import calculator.impl.AddImpl;
import calculator.impl.DiviImpl;
import calculator.impl.MinusImpl;
import calculator.impl.MultiImpl;
import utils.TextUtils;

public class CalculatorFactory {
    public static ICalculate newInstance(String type) {
//        if (TextUtils.isEmpty(type)) {
//            throw new RuntimeException("未识别的算法");
//        } else {
//            switch (type) {
//                case "+":
//                    return new AddImpl();
//                case "-":
//                    return new MinusImpl();
//                case "*":
//                    return new MultiImpl();
//                case "/":
//                    return new DiviImpl();
//                default:
//                    throw new RuntimeException("未识别的算法");
//            }
//        }
        return CalculateType.parse(type);
    }
}

