package visitor;

public class Female implements IPerson {
    @Override
    public void action(IAction action) {
        action.doFemaleAction();
    }
}
