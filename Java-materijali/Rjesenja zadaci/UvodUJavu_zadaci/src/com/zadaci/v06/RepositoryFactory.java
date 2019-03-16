package com.zadaci.v06;

public class RepositoryFactory {

    public static Repository getRepository(int repoType) {
        switch (repoType) {
            case 1:
                return new MemoryRepository();
            case 2:
                return new FileRepository();
            default:
                return null;
        }
    }

}
