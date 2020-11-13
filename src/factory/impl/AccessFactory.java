package factory.impl;

import factory.IFactory;
import factory.IUser;
import factory.UserEntity;

public class AccessFactory implements IFactory {
    @Override
    public IUser userManager() {
        return new IUser() {
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
        };
    }
}
