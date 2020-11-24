package visitor;

import utils.LogUtil;

public class SuccessAction implements IAction {
    @Override
    public void doMaleAction() {
        LogUtil.log("男人成功时Action!");
    }

    @Override
    public void doFemaleAction() {
        LogUtil.log("女人成功时Action!");
    }

    @Override
    public void doChildAction() {
        LogUtil.log("小孩成功时Action!");
    }
}
