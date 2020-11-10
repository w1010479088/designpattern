package proxy;

import utils.LogUtil;

public class Render implements IProxy {
    private final IProxy proxy;

    public static void main(String[] args) {
        Homer homer = new Homer();
        Proxyer proxyer = new Proxyer(homer);
        Render render = new Render(proxyer);
        render.rend();
    }

    public Render(IProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public void rend() {
        LogUtil.log("租客 需要租房子");
        proxy.rend();
    }
}
