package visitor;

import utils.LogUtil;

public class LoveAction implements IAction {
    @Override
    public void doMaleAction() {
        LogUtil.log("男人恋爱时Action!");
    }

    @Override
    public void doFemaleAction() {
        LogUtil.log("女人恋爱时Action!");
    }

    @Override
    public void doChildAction() {
        LogUtil.log("小孩恋爱时Action!");
    }
}
