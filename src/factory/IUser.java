package factory;

public interface IUser {

    UserEntity get(int id);

    void add(UserEntity item);

    void remove(UserEntity item);
}
