//CardLayoutPrimjer.java
package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutPrimjer extends JFrame {

    JButton btnPrev;
    JButton btnNext;
    JButton btnLast;
    JButton btnFirst;
    JPanel pnlTrakaSGumbima;
    JPanel pnlKarte;
    JPanel pnlCrvena;
    JPanel pnlZuta;
    JPanel pnlZelena;
    JPanel pnlPlava;
    CardLayout cl;

    public CardLayoutPrimjer(String naziv) {
        super(naziv);
        pnlTrakaSGumbima = new JPanel();
        btnPrev = new JButton("Prethodni");
        btnNext = new JButton("Sljedeći");
        btnLast = new JButton("Zadnji");
        btnFirst = new JButton("Prvi");
// dodaj gumbe na traku - kako je FlowLayout predefinirani upravitelj za
// JPanel, gumbi će biti prikazani koristeći taj upravitelj
        pnlTrakaSGumbima.add(btnFirst);
        pnlTrakaSGumbima.add(btnLast);
        pnlTrakaSGumbima.add(btnPrev);
        pnlTrakaSGumbima.add(btnNext);
// klikom na gumbiće pozivamo određene metode klase CardLayout kako bi
// upravljali kartama
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.next(pnlKarte);
            }
        });
        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.previous(pnlKarte);
            }
        });
        btnFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.first(pnlKarte);
            }
        });
        btnLast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.last(pnlKarte);
            }
        });
// dodaj traku na sjeverno područje glavnog prozora - predefinirani
// upravitelj za JFrame je BorderLayout
        this.getContentPane().add(pnlTrakaSGumbima, BorderLayout.NORTH);
// kreiraj JPanel u kojeg ćemo staviti komponente
        pnlKarte = new JPanel();
// kreiraj CardLayout upravitelj
        cl = new CardLayout();
        // podesi upravitelj za pnlKarte

        pnlKarte.setLayout(cl);
// kreiraj komponenete
        pnlCrvena = new JPanel();
        pnlCrvena.setBackground(Color.RED);
        pnlZuta = new JPanel();
        pnlZuta.setBackground(Color.YELLOW);
        pnlZelena = new JPanel();
        pnlZelena.setBackground(Color.GREEN);
        pnlPlava = new JPanel();
        pnlPlava.setBackground(Color.BLUE);
// dodaj komponente na pnlKarte
        pnlKarte.add(pnlCrvena, "crvena");
        pnlKarte.add(pnlZuta, "zuta");
        pnlKarte.add(pnlZelena, "zelena");
        pnlKarte.add(pnlPlava, "plava");
// dodaj pnlKaret u centralno područje prozora
        this.getContentPane().add(pnlKarte, BorderLayout.CENTER);
        setBounds(400, 300, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        CardLayoutPrimjer clp = new CardLayoutPrimjer("CardLayout Primjer");
    }
}
