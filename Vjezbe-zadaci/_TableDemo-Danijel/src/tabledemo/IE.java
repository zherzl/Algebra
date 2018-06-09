/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabledemo;

import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;

/**
 *
 * @author danijel.kucak
 */
public class IE extends JFrame {
    
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
               new IE("Infoeduka").setVisible(true);
            }
        });
}
    
    JScrollPane spStudenti;
    JTable tblStudenti;

    public IE(String title) throws HeadlessException {
        super(title);
        
//        tblStudenti = new JTable(new Object[][]{{"pero",true,1,1.1},{"pero",true,1,1.1}},new Object[]{"a","b","c","d"});
                tblStudenti = new JTable(new TableModel());

        spStudenti = new JScrollPane(tblStudenti);
        tblStudenti.setFillsViewportHeight(true);
        
        tblStudenti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        tblStudenti.getModel().addTableModelListener((TableModelEvent e) -> {
            int row = e.getFirstRow();
            int col = e.getColumn();
            System.out.println(row+" "+col);
        });
        
        tblStudenti.setAutoCreateRowSorter(true);
        
        tblStudenti.getColumnModel().getColumn(3).setCellRenderer(new TableCellProsjekRenderer());
        
        JComboBox<Integer> cb = new JComboBox<>();
        
        for (int i = 1; i <= 5; i++) {
            cb.addItem(i);
        }
        
        tblStudenti.getColumnModel().getColumn(1).setCellEditor(new TableCellGodinaStudijaEditor(cb));

        
        getContentPane().add(spStudenti);
        
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    
}
