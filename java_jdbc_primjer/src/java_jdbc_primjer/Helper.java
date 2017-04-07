package java_jdbc_primjer;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.sql.DataSource;

/**
 * Pomocna klasa za kreiranje instance DataSource-a.
 */
public class Helper {
    public static DataSource createDataSource() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("localhost");
        ds.setDatabaseName("pppk-jdbc-demo");
        ds.setUser("sa");
        ds.setPassword("SQL");
        ds.setPortNumber(1433);
        return ds;
    }
    
        /**
     * Kreira listu gradova koji pripadaju drzavi s IDem '1'.
     * Gradovi imaju genericke naziv "Grad0,...GradN".
     * 
     * @return listu gradova koji pripadaju drzavi s IDem '1'
     */
    // Samo primjer...nije za primjenu
    public static List<Grad> generirajGradove() {
        List<Grad> gradovi = new LinkedList<Grad>();
        final int idDrzave = 1; // svaki grad neka ima idDrzave=1
        for(int i = 0; i < 1000; i++) {
            gradovi.add(new Grad(0, idDrzave, "Grad" + i));
        }
        return gradovi;
    }
}
