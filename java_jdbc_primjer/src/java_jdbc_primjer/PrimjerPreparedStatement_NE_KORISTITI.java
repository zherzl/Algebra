package java_jdbc_primjer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;

public class PrimjerPreparedStatement_NE_KORISTITI {

    public static void main(String[] args) {
        DataSource dataSource = Helper.createDataSource();

        try {
            List<Grad> gradovi = Helper.generirajGradove();
            insertajGradove(dataSource, gradovi);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("KRAJ");
    }

    private static void insertajGradove(DataSource dataSource, List<Grad> gradovi) throws SQLException {
        // kreiraj konekciju i pripremi naredbu za izvrsavanje - naredba se priprema samo jednom!
        try (Connection conn = dataSource.getConnection();
                PreparedStatement stmnt = conn.prepareStatement("INSERT INTO Grad VALUES(?,?)")) {

            // izvrsi pripremljenu naredbu - samo se mjenjaju parametri
            for (Grad grad : gradovi) {
                stmnt.setInt(1, grad.getIdDrzave());    // vrijednost 1. parametra
                stmnt.setString(2, grad.getNaziv());    // vrijednost 2. parametra
                stmnt.executeUpdate();                  // izvrsi naredbu
            }
        }
    }
}
