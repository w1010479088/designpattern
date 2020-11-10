package decorator;

import decorator.impl.Coat;
import decorator.impl.TShirt;
import decorator.impl.Trouser;
import utils.LogUtil;

public class Person implements IShow {
    public static void main(String[] args) {
        IShow person = new Person("大俊子");
        IShow trouser = new Trouser(person);
        IShow tshirt = new TShirt(trouser);
        IShow coat = new Coat(tshirt);
        coat.show();
    }

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        LogUtil.log(name + "开始展示:");
    }
}
