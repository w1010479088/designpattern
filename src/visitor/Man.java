package visitor;

public class Man implements IPerson {
    @Override
    public void action(IAction action) {
        action.doMaleAction();
    }
}
