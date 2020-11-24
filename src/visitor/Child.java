package visitor;

public class Child implements IPerson {
    @Override
    public void action(IAction action) {
        action.doChildAction();
    }
}
