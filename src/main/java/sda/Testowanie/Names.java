package sda.Testowanie;

import java.util.ArrayList;
import java.util.List;

public class Names {

    private List<String> names = new ArrayList<>();
    private IdGenerator idGenerator;

    public Names(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;

        names.add("Jan");
        names.add("Adam");
        names.add("Janusz");
    }

    public String getRandomName() {
        return names.get(idGenerator.getUniqueId());
    }
}
