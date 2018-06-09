/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabledemo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author danijel.kucak
 */
public class TableCellProsjekRenderer extends JLabel implements javax.swing.table.TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        float prosjek = (float) value;
        
        setOpaque(true);

        if (prosjek<3.5) {
            setForeground(Color.black);
            setBackground(Color.RED);
        } else {
            setForeground(Color.black);
            setBackground(Color.GREEN);
        }
        
        setText(value.toString());

        return this;

    }

}
