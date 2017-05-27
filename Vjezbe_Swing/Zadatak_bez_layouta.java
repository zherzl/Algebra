/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui_na_zgance;
 
import java.awt.HeadlessException;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
 
/**
*
* @author Zlatko
*/
public class SuperGUI extends JFrame {
 
    JTextField txtIme;
    JTextField txtPrezime;
    JSpinner godine;
    JRadioButton spol;
    JList zanimanja;
    JButton submit;
    JFrame frame;
   
    public SuperGUI() throws HeadlessException {
        this.setSize(500, 500);
        this.setLocation(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dodajIme();
        dodajPrezime();
        dodajGodine();
        dodajZanimanje();
        frame = this;
        this.setVisible(true);
    }
 
    private void dodajIme() {
        JLabel lblIme = new JLabel("Ime");
        lblIme.setBounds(0, 0 , 50, 20);
        this.getContentPane().add(lblIme);
       
        txtIme = new JTextField();
        txtIme.setBounds(50, 0, 100, 20);
        this.getContentPane().add(txtIme);
    }
    private void dodajPrezime() {
        JLabel lbl = new JLabel("Prezime");
        lbl.setBounds(0, 21, 50, 20);
        this.getContentPane().add(lbl);
       
        txtPrezime = new JTextField();
        txtPrezime.setBounds(50, 21, 100, 20);
        this.getContentPane().add(txtPrezime);
    }
    private void dodajGodine() {
        godine = new JSpinner();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 10; i < 51; i++) {
            lista.add(i);
        }
        SpinnerListModel model = new SpinnerListModel(lista);
        godine.setModel(model);
        godine.setBounds(50, 42, 100, 20);
        this.getContentPane().add(godine);
    }
 
    private void dodajZanimanje() {
        zanimanja = new JList();
        ArrayList<Zanimanje> lista = Zanimanje.getZanimanja();
       
        DefaultListModel model = new DefaultListModel();
        model.addElement(lista.get(0));
        model.addElement(lista.get(1));
       
        zanimanja.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                frame.setTitle(zanimanja.getSelectedValue().toString());
            }
        });
        zanimanja.setModel(model);
        zanimanja.setBounds(50, 63, 200, 50);
        this.getContentPane().add(zanimanja);
    }
   
    
}