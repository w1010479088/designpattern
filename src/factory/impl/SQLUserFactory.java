package factory.impl;

import factory.IFactory;
import factory.IUser;

public class SQLUserFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SQLUser();
    }
}
