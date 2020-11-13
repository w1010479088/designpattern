package factory;

import factory.impl.SQLUserFactory;

public class DBAccessor {
    private static final IFactory factory;

    static {
        //数据库切换地方
        factory = new SQLUserFactory();
//        factory = new AccessFactory();
    }

    public static IUser createUser() {
        return factory.createUser();
    }

    public static IDepartment createDepartment() {
        return factory.createDepartment();
    }
}
