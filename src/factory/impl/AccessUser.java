package factory.impl;

import factory.IUser;
import factory.UserEntity;

public class AccessUser implements IUser {
    @Override
    public UserEntity read(int id) {
        return UserEntity.emptyUser();
    }

    @Override
    public void edit(UserEntity item) {

    }

    @Override
    public void del(UserEntity item) {

    }
}
