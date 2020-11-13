package factory;

public class DepartmentEntity {
    private int id;
    private String name;

    private static DepartmentEntity emptyEntity;

    public static DepartmentEntity emptyEntity() {
        if (emptyEntity == null) {
            emptyEntity = new DepartmentEntity();
            emptyEntity.id = 0;
            emptyEntity.name = "暂无此部门";
        }
        return emptyEntity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
