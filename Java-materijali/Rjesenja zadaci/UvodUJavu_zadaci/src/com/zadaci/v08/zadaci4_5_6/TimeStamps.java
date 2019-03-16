package com.zadaci.v08.zadaci4_5_6;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class TimeStamps {

    public static void main(String[] args) {
        try {
            Path p = Paths.get("zadatak.txt");
            BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);

            System.out.println(attr.creationTime());
            System.out.println(attr.lastModifiedTime());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
