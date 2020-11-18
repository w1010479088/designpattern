package responsibility;

import responsibility.impl.AHandler;
import responsibility.impl.BHandler;
import responsibility.impl.CHandler;

public class Tester {
    public static void main(String[] args) {
        int request = 9;
        IHandler handlerA = new AHandler();
        IHandler handlerB = new BHandler();
        IHandler handlerC = new CHandler();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handle(request);
    }
}
