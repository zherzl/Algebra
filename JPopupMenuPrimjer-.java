/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author danijel.kucak
 */
//JPopupMenuPrimjer.java
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JPopupMenuPrimjer extends JFrame {

    JPopupMenu kontekstni;

    public JPopupMenuPrimjer(String naziv) {
        super(naziv);
        setBounds(400, 300, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        kreirajKontekstni();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    kontekstni.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    kontekstni.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        setVisible(true);
    }

    public void kreirajKontekstni() {
        kontekstni = new JPopupMenu();
        JMenuItem jmCrvena = new JMenuItem("crvena pozadina", new ImageIcon("red.gif"));
        JMenuItem jmZuta = new JMenuItem("žuta pozadina", new ImageIcon("yellow.gif"));
        kontekstni.add(jmCrvena);
        kontekstni.add(jmZuta);
        jmCrvena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });
        jmZuta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });
    }

    public static void main(String[] args) {
        JPopupMenuPrimjer jpmp = new JPopupMenuPrimjer("JPopupMenu Primjer");
    }
}
