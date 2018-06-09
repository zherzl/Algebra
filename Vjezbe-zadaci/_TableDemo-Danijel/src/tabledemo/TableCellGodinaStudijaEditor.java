/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabledemo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author danijel.kucak
 */
public class TableCellGodinaStudijaEditor extends DefaultCellEditor  {

    public TableCellGodinaStudijaEditor(JComboBox comboBox) {
        super(comboBox);
    }

    
}
