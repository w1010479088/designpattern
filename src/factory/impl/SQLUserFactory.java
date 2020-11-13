package factory.impl;

import factory.IDepartment;
import factory.IFactory;
import factory.IUser;

public class SQLUserFactory implements IFactory {
    private final IUser user = new SQLUser();
    private final IDepartment department = new SQLDepartment();

    @Override
    public IUser createUser() {
        return user;
    }

    @Override
    public IDepartment createDepartment() {
        return department;
    }
}
