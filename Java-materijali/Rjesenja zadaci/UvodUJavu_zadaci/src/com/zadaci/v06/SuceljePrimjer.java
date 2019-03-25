package com.zadaci.v06;

public class SuceljePrimjer {

    public static void main(String[] args) {
        Repository repo = RepositoryFactory.getRepository(2);
        
        for (String s : repo.getData()) {
            System.out.println(s);
        }
    }

}
