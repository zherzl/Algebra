
package DAL.Factory;

import DAL.DB.*;
import DAL.Interfaces.*;

public class RepoFactory {
    
    public static IDoctorsRepo getDoctorsRepo() {
        return new DoctorsRepo();
    }
    
    public static IPatientRepo getPatientRepo() {
        return new PatientsRepo();
    }
    
    
    public static IDrzaveRepo getDrzaveRepo() {
        return new DrzaveRepo();
    }
}
