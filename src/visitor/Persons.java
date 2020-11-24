package visitor;

import decorator.Person;

import java.util.ArrayList;
import java.util.List;

public class Persons {
    private final List<IPerson> persons = new ArrayList<>();

    public void add(IPerson person) {
        if (!persons.contains(person)) {
            persons.add(person);
        }
    }

    public void remove(IPerson person) {
        persons.remove(person);
    }

    public void action(IAction action) {
        for (IPerson person : persons) {
            person.action(action);
        }
    }
}
