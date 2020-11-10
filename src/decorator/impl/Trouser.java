package decorator.impl;

import decorator.IShow;
import utils.LogUtil;

public class Trouser implements IShow {
    private final IShow person;

    public Trouser(IShow person) {
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
        LogUtil.log("Trouser");
    }
}
