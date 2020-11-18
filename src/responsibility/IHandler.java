package responsibility;

public abstract class IHandler {
    protected IHandler nextHandler;

    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(int level);
}
