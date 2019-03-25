package gui_jlist;

import java.util.*;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import models.Zanimanje;
import repo.Repository;
import repo.RepositoryFactory;

public class GlavnaForma extends javax.swing.JFrame {

    private Repository repo;

    public GlavnaForma() {
        initComponents();
        this.repo = RepositoryFactory.getRepository();
        pripremiListuZanimanja();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spolGroup = new javax.swing.ButtonGroup();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spGodine = new javax.swing.JSpinner();
        btnSpolM = new javax.swing.JRadioButton();
        btnSpolZ = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListZanimanja = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblOdabranoZanimanje = new javax.swing.JLabel();
        btnPrikaziiPodatke = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPrezime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ime");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Prezime");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Godine");

        spGodine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        spolGroup.add(btnSpolM);
        btnSpolM.setText("M");

        spolGroup.add(btnSpolZ);
        btnSpolZ.setText("Ž");

        jListZanimanja.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListZanimanja);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Zanimanja");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Odabrano zanimanje:");

        lblOdabranoZanimanje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOdabranoZanimanje.setText("-");

        btnPrikaziiPodatke.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrikaziiPodatke.setText("Prikaži podatke");
        btnPrikaziiPodatke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziiPodatkeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOdabranoZanimanje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spGodine, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnSpolZ)
                                .addGap(34, 34, 34)
                                .addComponent(btnSpolM))
                            .addComponent(btnPrikaziiPodatke, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spGodine, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpolZ)
                    .addComponent(btnSpolM))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(lblOdabranoZanimanje))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnPrikaziiPodatke, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrikaziiPodatkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziiPodatkeActionPerformed
        if (provjeriPodatke()) {
            StringBuilder sb = new StringBuilder();
            sb.append("\nIme i prezime:");
            sb.append(txtIme.getText());
            sb.append("\nGodina:");
            sb.append(spGodine.getValue());
            sb.append("\nSpol:");

            if (btnSpolM.isSelected()) {
                sb.append("\nMuško");
            } else {
                sb.append("\nŽensko");
            }

            sb.append("\nZanimanje");
            sb.append(lblOdabranoZanimanje.getText());
            
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }//GEN-LAST:event_btnPrikaziiPodatkeActionPerformed

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
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrikaziiPodatke;
    private javax.swing.JRadioButton btnSpolM;
    private javax.swing.JRadioButton btnSpolZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListZanimanja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOdabranoZanimanje;
    private javax.swing.JSpinner spGodine;
    private javax.swing.ButtonGroup spolGroup;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void pripremiListuZanimanja() {
        List<Zanimanje> zanimanja = repo.getZanimanja();
        DefaultListModel listModel = pripremiListModel(zanimanja);
        jListZanimanja.setModel(listModel);

        jListZanimanja.addListSelectionListener((ListSelectionEvent lse) -> {
            odabirUListi(listModel);
        });
    }

    private void odabirUListi(DefaultListModel listModel) {
        int index = jListZanimanja.getSelectedIndex();
        if (index > -1) {
            Zanimanje odabrano = (Zanimanje) listModel.getElementAt(index);
            lblOdabranoZanimanje.setText(odabrano.getNaziv());
        }
    }

    private DefaultListModel pripremiListModel(List<Zanimanje> zanimanja) {
        DefaultListModel dlm = new DefaultListModel();
        zanimanja.forEach(x -> dlm.addElement(x));
        return dlm;
    }

    private boolean provjeriPodatke() {
        ButtonModel spol = spolGroup.getSelection();
        if (spol == null) {
            JOptionPane.showMessageDialog(this, "Niste odabrali spol");
            return false;
        }
        if (txtIme.getText().trim().length() == 0 || txtPrezime.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Morate upisati ime i prezime");
            return false;
        }
        
        if ((int)spGodine.getValue() <= 0) {
            JOptionPane.showMessageDialog(this, "Niste upisali godine");
            return false;
        }
        return true;
    }

}
