package mediator;

import utils.LogUtil;

public class Country {
    private final String name;
    private final IMediator mediator;

    public Country(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String msg) {
        mediator.update(msg, this);
    }

    public void receive(String msg) {
        LogUtil.log(name + "--->" + msg);
    }
}
