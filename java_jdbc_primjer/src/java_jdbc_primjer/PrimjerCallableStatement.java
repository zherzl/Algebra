package java_jdbc_primjer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Primjer poziva SQL procedure koristeci CallableStatement.
 */
public class PrimjerCallableStatement {

    public static void main(String[] args) {
        DataSource dataSource = Helper.createDataSource();

        try {
            List<Grad> gradovi = Helper.generirajGradove();
            dodajGradove(dataSource, gradovi);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("KRAJ");
    }

    /**
     * Dodaje gradove u bazu pozivanjem SQL procedure DodajGrad koja ima 2
     * parametra: IDDrzave i naziv grada.
     *
     * @param dataSource koji se koristi za dohvacanje konekcije
     * @param gradovi koje treba dodati
     * @throws SQLException
     */
    private static void dodajGradove(DataSource dataSource, List<Grad> gradovi) throws SQLException {
        // kreiraj konekciju i pripremi naredbu za izvrsavanje SQL procedure
        try (Connection conn = dataSource.getConnection();
                CallableStatement stmnt = conn.prepareCall("{CALL DodajGrad(?,?)}")) {

            // izvrsi pripremljenu naredbu - samo se mjenjaju parametri
            for (Grad grad : gradovi) {
                stmnt.setInt(1, grad.getIdDrzave());    // vrijednost 1. parametra
                stmnt.setString(2, grad.getNaziv());    // vrijednost 2. parametra
                stmnt.executeUpdate();                  // izvrsi naredbu
            }
        }
    }
}
