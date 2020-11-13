package factory.impl;

import factory.IDepartment;
import factory.IFactory;
import factory.IUser;

public class SQLUserFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SQLUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SQLDepartment();
    }
}
