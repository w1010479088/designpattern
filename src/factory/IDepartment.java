package factory;

public interface IDepartment {
    DepartmentEntity get(int id);

    void add(DepartmentEntity item);

    void remove(int id);
}
