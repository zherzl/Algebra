
package com.jdbc.repo;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.sql.DataSource;

public class SqlDataSource {
    public static DataSource createDataSource() {
        // Za sljedeće akcije potrebno je imati ADMIN ovlasti na lokalnom računalu
        // Da bi Java aplikacija mogla pristupiti SQL Serveru, potrebno je u 
        // Computer Management -> Services And Applications - > SQL  Server Configuration
        // -> Sql Server Network Configuration -> Protocols for SQL uključiti TCP/IP protokol,
        // a u postavkama TCP/IP pod karticom IP Addresses moraju biti pod IPALL 
        // 1. upisan TCP Port 1433
        // 2. TCP Dynamic Ports prazan
        // Nakon izmjena otići pod SQL Server Services i napraviti restart instance SQL Servera
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("localhost\\mojsql"); // Ako je u pitanju Sql express, onda ide samo localhost
        ds.setDatabaseName("AdventureWorksOBP");
        ds.setUser("sa");
        ds.setPassword("SQL");
        ds.setPortNumber(1433);
        return ds;
    }
}
