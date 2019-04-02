
package com.knjige.factory;

import com.knjige.repo.*;

public class RepoFactory {
    public static IRepo getRepo(RepoType repoType) {
        switch (repoType) {
            case StaticRepo: return new StaticRepo();
            default: return null;
        }
    }
}
