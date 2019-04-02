
package com.jdbc.factory;

import com.jdbc.repo.*;



public class RepoFactory {
    public static IRepo getRepository(RepoType repoTypoe) {
        switch (repoTypoe) {
            case SqlRepo: return new SqlRepo();
            default: return null;
        }
    }
}
