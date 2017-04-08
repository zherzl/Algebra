/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Zlatko
 */
public class RepoFactory {
    public static IRepo GetRepoInstance(int repoTip) {
        switch (repoTip) {
            case 1:
                return new SqlRepo();
            default:
                return null;
        }
    }
}
