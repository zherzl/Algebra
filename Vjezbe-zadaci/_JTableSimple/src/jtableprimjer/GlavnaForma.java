
package jtableprimjer;

import dal.Factory;
import dal.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Student;


public class GlavnaForma extends javax.swing.JFrame {

    private IRepo repo = Factory.getRepo();
    DefaultTableModel dtm = new DefaultTableModel();

    public GlavnaForma() {
        initComponents();
        podesiTablicuStudenata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtGodina = new javax.swing.JTextField();
        txtSmjer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudenti = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtGodina.setText("0");
        txtGodina.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIme)
            .addComponent(txtPrezime)
            .addComponent(txtSmjer)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtGodina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtGodina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtSmjer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblStudenti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblStudenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentiMouseClicked(evt);
            }
        });
        tblStudenti.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblStudentiPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudenti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentiMouseClicked
        int row = tblStudenti.getSelectedRow();
        txtIme.setText(dtm.getValueAt(row, 0).toString());
        txtPrezime.setText(dtm.getValueAt(row, 1).toString());
        txtGodina.setText(dtm.getValueAt(row, 2).toString());
        txtSmjer.setText(dtm.getValueAt(row, 3).toString());

    }//GEN-LAST:event_tblStudentiMouseClicked

    private void tblStudentiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblStudentiPropertyChange


    }//GEN-LAST:event_tblStudentiPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tblStudenti.getSelectedRow();
        dtm.setValueAt(txtIme.getText(), row, 0);
        dtm.setValueAt(txtPrezime.getText(), row, 1);
        dtm.setValueAt(txtGodina.getText(), row, 2);
        dtm.setValueAt(txtSmjer.getText(), row, 3);
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStudenti;
    private javax.swing.JTextField txtGodina;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtSmjer;
    // End of variables declaration//GEN-END:variables

    private void podesiTablicuStudenata() {

        dtm.setColumnIdentifiers(Student.studentKolone());
        List<Student> students = repo.getAllStudents();

        Object[] rows2 = students.toArray();

        for (int i = 0; i < students.size(); i++) {

            Object[] row = new Object[Student.studentKolone().length];
            row[0] = students.get(i).getIme();
            row[1] = students.get(i).getPrezime();
            row[2] = students.get(i).getGodinaStudija();
            row[3] = students.get(i).getSmjer();
            row[4] = students.get(i).getId();
            dtm.addRow(row);
        }

        tblStudenti.setModel(dtm);
        // Cheat: skrivamo id kolonu
        TableColumn kol = tblStudenti.getColumnModel().getColumn(4);
        kol.setMinWidth(0);
        kol.setPreferredWidth(0);
        kol.setMaxWidth(0);

        dtm.addTableModelListener((TableModelEvent tme) -> {
            DefaultTableModel tm = (DefaultTableModel)tme.getSource();
        });
        
    }
}
