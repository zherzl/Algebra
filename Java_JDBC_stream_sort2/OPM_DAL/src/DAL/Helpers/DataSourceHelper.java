package DAL.Helpers;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.sql.DataSource;

public class DataSourceHelper {

    public static DataSource getDataSource() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setDatabaseName("ALPSv4");
        ds.setServerName("SharpPC");
        ds.setUser("sa");
        ds.setPassword("SQL");
        ds.setPortNumber(1433);
        return ds;

    }
}
