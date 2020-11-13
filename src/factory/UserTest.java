package factory;

import factory.impl.SQLUserFactory;

public class UserTest {
    public static void main(String[] args) {
        IUser user = new SQLUserFactory().userManager();
        UserEntity entity = user.read(0);
    }
}
