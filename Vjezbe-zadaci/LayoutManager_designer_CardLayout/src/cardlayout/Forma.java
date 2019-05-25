/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardlayout;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author LH
 */
public class Forma extends javax.swing.JFrame {

    public Forma() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.getContentPane().add(glavniIzbornik, BorderLayout.SOUTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        pnlPrvi = new javax.swing.JPanel();
        btnFirstPanel = new javax.swing.JButton();
        pnlDrugi = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        glavniIzbornik = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("GUMB 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.WEST);

        pnlMain.setLayout(new java.awt.CardLayout());

        pnlPrvi.setBackground(new java.awt.Color(0, 240, 240));

        btnFirstPanel.setText("GUMB PRVI PANEL");

        javax.swing.GroupLayout pnlPrviLayout = new javax.swing.GroupLayout(pnlPrvi);
        pnlPrvi.setLayout(pnlPrviLayout);
        pnlPrviLayout.setHorizontalGroup(
            pnlPrviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrviLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnFirstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(953, Short.MAX_VALUE))
        );
        pnlPrviLayout.setVerticalGroup(
            pnlPrviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrviLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnFirstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
        );

        pnlMain.add(pnlPrvi, "card2");

        pnlDrugi.setBackground(new java.awt.Color(140, 0, 140));

        jButton2.setText("BTN DRUGI PANEL");

        javax.swing.GroupLayout pnlDrugiLayout = new javax.swing.GroupLayout(pnlDrugi);
        pnlDrugi.setLayout(pnlDrugiLayout);
        pnlDrugiLayout.setHorizontalGroup(
            pnlDrugiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDrugiLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        pnlDrugiLayout.setVerticalGroup(
            pnlDrugiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDrugiLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        pnlMain.add(pnlDrugi, "card3");

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        glavniIzbornik.add(jMenu1);

        jMenu2.setText("Edit");
        glavniIzbornik.add(jMenu2);

        setJMenuBar(glavniIzbornik);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        CardLayout cl = (CardLayout) pnlMain.getLayout();
        cl.next(pnlMain);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirstPanel;
    private javax.swing.JMenuBar glavniIzbornik;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel pnlDrugi;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlPrvi;
    // End of variables declaration//GEN-END:variables
}
