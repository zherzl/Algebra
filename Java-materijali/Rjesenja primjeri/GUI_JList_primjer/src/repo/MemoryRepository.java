package repo;

import java.util.ArrayList;
import java.util.List;
import models.Zanimanje;

public class MemoryRepository implements Repository {

    @Override
    public List<Zanimanje> getZanimanja() {
        List<Zanimanje> zanimanja = new ArrayList<>();
        zanimanja.add(new Zanimanje(1, "Frizer"));
        zanimanja.add(new Zanimanje(2, "Vodonoša"));
        zanimanja.add(new Zanimanje(3, "Programer"));
        zanimanja.add(new Zanimanje(4, "Elektrotehničar"));
        return zanimanja;
    }

}
