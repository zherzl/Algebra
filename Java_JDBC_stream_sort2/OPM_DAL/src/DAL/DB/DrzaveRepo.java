/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.DB;

import DAL.Interfaces.*;
import Model.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author LH
 */
public class DrzaveRepo extends BaseRepo implements IDrzaveRepo {
    
    
    @Override
    public List<Drzava> getDrzave() throws Exception {

        List<Drzava> drzave = new ArrayList<>();

        try (Connection conn = ds.getConnection(); CallableStatement st = conn.prepareCall("{call GetDrzave}")) {

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Drzava d = new Drzava();
                d.setId(rs.getInt("Drzava_ID"));
                d.setNazivHrKratki(rs.getString("NazivHrKratki"));
                d.setNazivHrPuni(rs.getString("NazivHrPuni"));
                d.setNazivEnKratki(rs.getString("NazivEnKratki"));
                drzave.add(d);
            }

        }

        return drzave;
    }

    @Override
    public void insertNovaDrzava(String nazivHr) throws Exception {
        try (Connection conn = ds.getConnection(); CallableStatement st = conn.prepareCall("{call InsertDrzava(?)}")) {

            Drzava d = new Drzava();
            
            st.setString("naziv", nazivHr);
            st.executeUpdate();
            
//            create proc InsertDrzava
//            @naziv nvarchar(50)
//            as
//             declare @count int
//
//             select @count = count(*) from tblDrzava d where d.NazivHrKratki = @naziv
//
//             if @count > 0	throw 50000, 'Država već postoji', 1;
//            insert into tblDrzava(NazivHrKratki) values(@naziv)
//


        }
    }
}
