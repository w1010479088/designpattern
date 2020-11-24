package visitor;

public class Tester {
    public static void main(String[] args) {
        Persons persons = new Persons();
        persons.add(new Man());
        persons.add(new Female());
        persons.add(new Child());

        IAction success = new SuccessAction();
        IAction fail = new FailAction();
        IAction love = new LoveAction();
        persons.action(success);
        persons.action(fail);
        persons.action(love);
    }
}
