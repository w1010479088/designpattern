package mediator;

public interface IMediator {
    void add(Country country);

    void remove(Country country);

    void update(String msg, Country country);
}
