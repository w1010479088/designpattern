package factory;

import factory.impl.SQLUserFactory;

public class UserTest {
    public static void main(String[] args) {
        IUser user = new SQLUserFactory().createUser();
        UserEntity entity = user.get(0);
    }
}
