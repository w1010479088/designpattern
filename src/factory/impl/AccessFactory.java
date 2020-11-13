package factory.impl;

import factory.IDepartment;
import factory.IFactory;
import factory.IUser;

public class AccessFactory implements IFactory {
    private final IUser user = new AccessUser();
    private final IDepartment department = new AccessDepartment();

    @Override
    public IUser createUser() {
        return user;
    }

    @Override
    public IDepartment createDepartment() {
        return department;
    }
}
