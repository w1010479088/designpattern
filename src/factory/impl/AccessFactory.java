package factory.impl;

import factory.IFactory;
import factory.IUser;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
