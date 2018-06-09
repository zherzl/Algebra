/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabledemo;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import repo.DB;
import repo.Student;

/**
 *
 * @author danijel.kucak
 */
public class TableModel extends AbstractTableModel {

    List<Student> studenti;

    @Override
    public int getRowCount() {
        return studenti.size();
    }

    @Override
    public int getColumnCount() {
        return Student.class.getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0://jmabg
                return studenti.get(rowIndex).getJmbag();
            case 1://godina
                return studenti.get(rowIndex).getGodina();
            case 2://redovni
                return studenti.get(rowIndex).isRedovni();
            case 3://prosjek
                return studenti.get(rowIndex).getProsjek();
            case 4://prezime
                return studenti.get(rowIndex).getPrezime();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1://gs
                 studenti.get(rowIndex).setGodina((int) aValue);
                fireTableCellUpdated(rowIndex, columnIndex);
                break;
            case 3://prosjek
                 studenti.get(rowIndex).setProsjek((float) aValue);
                fireTableCellUpdated(rowIndex, columnIndex);
                break;
        }
    }
    
    

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return true;
    }
    
    
    
    

    public TableModel() {
        studenti = DB.getStudents();
    }

}
