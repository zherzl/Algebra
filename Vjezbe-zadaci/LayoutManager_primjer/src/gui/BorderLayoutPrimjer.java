//BorderLayoutPrimjer.java
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutPrimjer extends JFrame {

    JButton btnSjever;
    JButton btnJug;
    JButton btnIstok;
    JButton btnZapad;
    JButton btnCentar;

    public BorderLayoutPrimjer(String naziv) {
        super(naziv);
// postavljanje upravitelja tipa BorderLayout - ovdje nije ni bilo
// potrebno jer je BorderLayout predefinirani upravitelj za JFrame
        setLayout(new BorderLayout());
        btnSjever = new JButton("Sjever");
        btnSjever.setBackground(Color.RED);
        btnJug = new JButton("Jug");
        btnJug.setBackground(Color.GREEN);
        btnIstok = new JButton("Istok");
        btnIstok.setBackground(Color.CYAN);
        btnZapad = new JButton("Zapad");
        btnZapad.setBackground(Color.YELLOW);
        btnCentar = new JButton("Centar");
        btnCentar.setBackground(Color.WHITE);
        getContentPane().add(btnSjever, BorderLayout.NORTH);
        getContentPane().add(btnJug, BorderLayout.SOUTH);
        getContentPane().add(btnIstok, BorderLayout.EAST);
        getContentPane().add(btnZapad, BorderLayout.WEST);
        getContentPane().add(btnCentar, BorderLayout.CENTER);
        setBounds(400, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayoutPrimjer jtp = new BorderLayoutPrimjer(
                "BorderLayout Primjer");
    }
}
