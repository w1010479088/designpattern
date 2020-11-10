package decorator.impl;

import decorator.IShow;
import utils.LogUtil;

public class TShirt implements IShow {
    private final IShow person;

    public TShirt(IShow person) {
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
        LogUtil.log("TShirt");
    }
}
