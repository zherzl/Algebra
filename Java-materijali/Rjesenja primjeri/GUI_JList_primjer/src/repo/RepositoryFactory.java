
package repo;


public class RepositoryFactory {
    public static Repository getRepository() {
        return new MemoryRepository();
    }
}
