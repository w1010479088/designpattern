package factory.impl;

import factory.IUser;
import factory.UserEntity;

public class SQLUser implements IUser {
    @Override
    public UserEntity get(int id) {
        return UserEntity.emptyUser();
    }

    @Override
    public void add(UserEntity item) {

    }

    @Override
    public void remove(UserEntity item) {

    }
}
