package factory;

public class UserTest {
    public static void main(String[] args) {
        IUser user = DBAccessor.createUser();
        IDepartment department = DBAccessor.createDepartment();
        UserEntity userEntity = user.get(0);
        DepartmentEntity departmentEntity = department.get(0);
    }
}
