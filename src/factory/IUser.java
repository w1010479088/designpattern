package factory;

public interface IUser {

    UserEntity read(int id);

    void edit(UserEntity item);

    void del(UserEntity item);
}
