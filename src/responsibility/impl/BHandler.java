package responsibility.impl;

import responsibility.IHandler;
import utils.LogUtil;

public class BHandler extends IHandler {
    @Override
    public void handle(int level) {
        if (level < 10) {
            LogUtil.log("B handled");
        } else {
            nextHandler.handle(level);
        }
    }
}
