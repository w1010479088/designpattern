package factory;

import factory.impl.SQLUserFactory;

public class UserTest {
    public static void main(String[] args) {
        IFactory factory = new SQLUserFactory();
        IUser user = factory.createUser();
        IDepartment department = factory.createDepartment();
        UserEntity userEntity = user.get(0);
        DepartmentEntity departmentEntity = department.get(0);
    }
}
