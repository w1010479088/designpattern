package factory;

public class UserEntity {
    private int id;
    private String name;

    private static UserEntity emptyUser;

    public static UserEntity emptyUser() {
        if (emptyUser == null) {
            emptyUser = new UserEntity();
            emptyUser.id = 0;
            emptyUser.name = "暂无此人";
        }
        return emptyUser;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
