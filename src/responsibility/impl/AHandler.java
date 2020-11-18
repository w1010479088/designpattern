package responsibility.impl;

import responsibility.IHandler;
import utils.LogUtil;

public class AHandler extends IHandler {
    @Override
    public void handle(int level) {
        if (level < 5) {
            LogUtil.log("A handled");
        } else {
            nextHandler.handle(level);
        }
    }
}
