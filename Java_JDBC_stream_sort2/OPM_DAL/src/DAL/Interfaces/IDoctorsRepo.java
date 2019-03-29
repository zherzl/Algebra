
package DAL.Interfaces;

import Model.*;
import java.util.List;


public interface IDoctorsRepo {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(int id);
    void InsertDoctor(Doctor d);
    
}
