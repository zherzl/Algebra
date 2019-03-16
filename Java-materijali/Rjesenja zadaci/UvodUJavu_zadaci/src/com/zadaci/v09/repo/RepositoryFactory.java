package com.zadaci.v09.repo;

import com.zadaci.v09.repo.MyEnums.RepoType;



public class RepositoryFactory {
    public static Repository getRepository(RepoType repoType) {
        switch (repoType) {
            case SqlRepo:
                return new SqlRepository();
            case FileRepo:
                return new FileRepository();
            default:
                return null;
        }
    }
}

