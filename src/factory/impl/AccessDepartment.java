package factory.impl;

import factory.DepartmentEntity;
import factory.IDepartment;

public class AccessDepartment implements IDepartment {
    @Override
    public DepartmentEntity get(int id) {
        return DepartmentEntity.emptyEntity();
    }

    @Override
    public void add(DepartmentEntity item) {

    }

    @Override
    public void remove(int id) {

    }
}
