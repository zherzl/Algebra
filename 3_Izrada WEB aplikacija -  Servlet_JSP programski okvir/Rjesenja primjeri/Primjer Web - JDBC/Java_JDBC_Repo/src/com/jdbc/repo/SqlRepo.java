package com.jdbc.repo;

import com.jdbc.factory.RepoFactory;
import com.jdbc.factory.RepoType;
import com.jdbc.models.Drzava;
import com.jdbc.models.Grad;
import com.jdbc.models.Kupac;
import com.jdbc.viewmodels.KupciZaDrzavuViewModel;
import java.sql.*;

import java.util.AbstractList;
import java.util.ArrayList;
import static java.util.Collections.reverseOrder;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.toList;
import javax.sql.DataSource;

public class SqlRepo implements IRepo {

    private DataSource ds;
    String error;
    boolean success;

    public String getError() {
        return error;
    }

    public boolean isSuccess() {
        return success;
    }

    public SqlRepo() {
        this.ds = SqlDataSource.createDataSource();
    }

    @Override
    public List<KupciZaDrzavuViewModel> dohvatiKupceZaDrzavu(int drzavaId) {

        success = true;

        List<KupciZaDrzavuViewModel> data = new ArrayList<KupciZaDrzavuViewModel>();

        try (Connection conn = ds.getConnection();
                CallableStatement stmt = conn.prepareCall("{CALL KupciZaDrzavu(?)}")) {

            stmt.setInt(1, drzavaId);// vrijednost 1. parametra
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                KupciZaDrzavuViewModel vm = new KupciZaDrzavuViewModel();
                // rs.get kao parametar prima naziv kolone koju procedura sadrži u rezultatu
                vm.setDrzava(rs.getString("Drzava"));
                vm.setGrad(rs.getString("Grad"));
                vm.setIme(rs.getString("Ime"));
                vm.setPrezime(rs.getString("Prezime"));
                vm.setEmail(rs.getString("Email"));
                vm.setKupacId(rs.getInt("IDKupac"));

                data.add(vm);
            }
        } catch (Exception e) {
            success = false;
            error = e.getMessage();
        }

        data = data.stream()
                .sorted(
                        comparing(KupciZaDrzavuViewModel::getPrezime)
                                .thenComparing(reverseOrder(comparing(KupciZaDrzavuViewModel::getIme))))
                .collect(toList());

        return data;
    }

    @Override
    public List<Drzava> dohvatiDrzave() {
        success = true;

        List<Drzava> data = new ArrayList<Drzava>();

        try (Connection conn = ds.getConnection();
                CallableStatement stmt = conn.prepareCall("{CALL Drzave}")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Drzava d = new Drzava();
                d.setiDDrzava(rs.getInt("IDDrzava"));
                d.setNaziv(rs.getString("Naziv"));
                data.add(d);
            }
        } catch (Exception e) {
            success = false;
            error = e.getMessage();
        }

        return data;
    }

    @Override
    public List<Grad> dohvatiGradove() {
        success = true;
        try {
            throw new UnsupportedOperationException("Metoda dohvati gradove nije implementirana");
        } catch (Exception e) {
            success = false;
            error = e.getMessage();
        }

        return null;
    }

    // Primjer prepared statementa za dohvat podataka. 
    // Preporuka je izbjegavati ovaj način kod kompleksnijih upita
    @Override
    public List<Kupac> dohvatiKupce() {
        success = true;
        List<Kupac> kupci = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Kupac")) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Kupac k = new Kupac();
                k.setEmail(rs.getString("Email"));
                k.setIdGrad(rs.getInt("GradID"));
                k.setiDKupac(rs.getInt("IDKupac"));
                k.setIme(rs.getString("Ime"));
                k.setPrezime(rs.getString("Prezime"));
                kupci.add(k);
            }
        } catch (SQLException ex) {
            success = false;
            error = ex.getMessage();
        }
        return kupci;
    }

    @Override
    public int dodajNovuDrzavu(String naziv) {
        success = true;

        List<Drzava> data = new ArrayList<Drzava>();
        int noviId = 0;

        try (Connection conn = ds.getConnection();
                CallableStatement stmt = conn.prepareCall("{CALL DodajNovuDrzavu(?,?)}")) {

            stmt.setString("naziv", naziv);
            stmt.registerOutParameter(2, Types.INTEGER);
            stmt.executeUpdate();
            // Dohvaćamo output parametar
            noviId = stmt.getInt(2);

        } catch (Exception e) {
            success = false;
            error = e.getMessage();
        }

        return noviId;
    }

    @Override
    public void obrisiDrzavu(int id) {
        success = true;

        try (Connection conn = ds.getConnection();
                PreparedStatement stmt = conn.prepareCall("DELETE FROM Drzava WHERE IDDrzava = ?")) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            success = false;
            error = e.getMessage();
        }

    }

    @Override
    public void updateKupac(Kupac k) {
        success = true;

        List<Drzava> data = new ArrayList<Drzava>();

        try (Connection conn = ds.getConnection();
                CallableStatement stmt = conn.prepareCall("{CALL UpdateKupac(?,?,?,?)}")) {

            stmt.setString("ime", k.getIme());
            stmt.setString("prezime", k.getPrezime());
            stmt.setInt("id", k.getiDKupac());
            stmt.setString("email", k.getEmail());
            stmt.executeUpdate();

        } catch (Exception e) {
            success = false;
            error = e.getMessage();
        }
    }

}
