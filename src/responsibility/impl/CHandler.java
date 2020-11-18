package responsibility.impl;

import responsibility.IHandler;
import utils.LogUtil;

public class CHandler extends IHandler {
    @Override
    public void handle(int level) {
        LogUtil.log("C handled");
    }
}
