package visitor;

import utils.LogUtil;

public class FailAction implements IAction {
    @Override
    public void doMaleAction() {
        LogUtil.log("男人失败时Action!");
    }

    @Override
    public void doFemaleAction() {
        LogUtil.log("女人失败时Action!");
    }

    @Override
    public void doChildAction() {
        LogUtil.log("小孩失败时Action!");
    }
}
