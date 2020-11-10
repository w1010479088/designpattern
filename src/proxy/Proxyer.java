package proxy;

import utils.LogUtil;

public class Proxyer implements IProxy {
    private final IProxy proxy;

    public Proxyer(Homer homer) {
        this.proxy = homer;
    }

    @Override
    public void rend() {
        LogUtil.log("Proxyer 需要找房子");
        proxy.rend();
    }
}
