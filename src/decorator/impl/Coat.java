package decorator.impl;

import decorator.IShow;
import utils.LogUtil;

public class Coat implements IShow {
    private final IShow person;

    public Coat(IShow person) {
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
        LogUtil.log("Coat");
    }
}
