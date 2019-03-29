package BL.Doctors;

import DAL.Factory.RepoFactory;
import Model.Doctor;
import java.util.List;
import DAL.Interfaces.IDoctorsRepo;

public class DoctorsBL {

    private IDoctorsRepo doctorsRepo;

    public DoctorsBL() {
        doctorsRepo = RepoFactory.getDoctorsRepo();
    }

    public void insertNewDoctor(Doctor d) {
        // pozovi dal spremanje...
    }

    public List<Doctor> getAllDoctors() {
        try {

        } catch (Exception e) {
            //Vrati poruku umjesto objekta
            String poruka = e.getMessage();
        }
        return null;
    }

    public Doctor getDoctorById() {
        try {
            return doctorsRepo.getDoctorById(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
