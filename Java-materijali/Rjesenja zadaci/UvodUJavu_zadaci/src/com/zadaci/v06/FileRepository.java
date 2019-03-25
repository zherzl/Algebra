package com.zadaci.v06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class FileRepository implements Repository {

    @Override
    public List<String> getData() {
        List<String> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Dani.txt"))) {
            String linija;
            while ((linija = br.readLine()) != null) {
                data.add(linija);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

}
