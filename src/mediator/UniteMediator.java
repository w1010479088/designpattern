package mediator;

import java.util.ArrayList;
import java.util.List;

public class UniteMediator implements IMediator {
    private final List<Country> countries = new ArrayList<>();

    @Override
    public void add(Country country) {
        if (!countries.contains(country)) {
            countries.add(country);
        }
    }

    @Override
    public void remove(Country country) {
        countries.remove(country);
    }

    @Override
    public void update(String msg, Country country) {
        for (Country item : countries) {
            if (item != country) {
                item.receive(msg);
            }
        }
    }
}
