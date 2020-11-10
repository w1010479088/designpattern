package proxy;

import utils.LogUtil;

public class Homer implements IProxy {
    @Override
    public void rend() {
        LogUtil.log("Homer 需要出租房子!");
    }
}
