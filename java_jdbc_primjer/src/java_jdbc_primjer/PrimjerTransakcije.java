package java_jdbc_primjer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import javax.sql.DataSource;

/**
 * Primjer koristenja JDBC transakcija.
 */
public class PrimjerTransakcije {

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
        try (Connection conn = dataSource.getConnection()) {
            try (CallableStatement stmnt = conn.prepareCall("{CALL DodajGrad(?,?)}")) {

                // iskljuci automatsko komitanje transakcije
                conn.setAutoCommit(false);

                // dodaj zadane gradove koristeci SQL proceduru
                for (Grad grad : gradovi) {
                    System.out.println("Dodajem grad: " + grad);
                    stmnt.setInt(1, grad.getIdDrzave());    // vrijednost 1. parametra
                    stmnt.setString(2, grad.getNaziv());    // vrijednost 2. parametra
                    stmnt.executeUpdate();                  // izvrsi SQL proceduru
                }

                // pitaj korisnika za potvrdu transakcije
                if (korisnikZeliPotvrditiTransakciju()) {
                    conn.commit();
                    System.out.println("Transakcija komitana - gradovi su dodani.");
                } else {
                    conn.rollback();
                    System.out.println("Transakcija prekinuta - gradovi nisu dodani.");
                }
            } catch (SQLException e) {
                conn.rollback();
                System.err.println("SQLException: transakcija prekinuta - gradovi nisu dodani");
                throw e;
            }
        }
    }

    /**
     * Pita korisnika da li zeli potvrditi transakciju i vraca true ili false.
     *
     * @return true ako korisnik zeli potvrditi transakciju, inace false.
     */
    private static boolean korisnikZeliPotvrditiTransakciju() {
        System.out.print("Zelite li potvrditi transakciju? (D/N):");
        return new Scanner(System.in).nextLine().toUpperCase().startsWith("D");
    }
}
