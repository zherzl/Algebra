package DAL.DB;

import Model.Doctor;
import java.util.*;
import DAL.Interfaces.IDoctorsRepo;
import Model.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorsRepo extends BaseRepo implements IDoctorsRepo {

    @Override
    public List<Doctor> getAllDoctors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor getDoctorById(int id) {

        Doctor d = new Doctor();
        try (Connection conn = ds.getConnection(); CallableStatement st = conn.prepareCall("{call GetDrzave}")) {

            ResultSet rs = st.getResultSet();

        } catch (Exception e) {
            d.setMessage(e.getMessage());
            d.setSuccess(false);
        }

        return d;
    }

    @Override
    public void InsertDoctor(Doctor d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
