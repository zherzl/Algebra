package com.zadaci.v06;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository implements Repository {

    @Override
    public List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add("Ponedjeljak");
        data.add("Utorak");
        data.add("Srijeda");
        data.add("Četvrtak");
        data.add("Petak");
        data.add("Subota");
        data.add("Nedjelja");
        return data;
    }

}
