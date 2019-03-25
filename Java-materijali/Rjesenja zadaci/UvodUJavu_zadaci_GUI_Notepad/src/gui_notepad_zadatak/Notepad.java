/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui_na_zgance;
 
import com.sun.javafx.tk.Toolkit;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
 

public class Notepad extends JFrame {
 
    JMenuBar bar;
    JTextArea txt;
    JFrame self = this;
   
    public Notepad() throws HeadlessException {
        super.setTitle("Postavi naslov");
        this.setSize(700, 500);
        this.setLocation(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dodajIzbornik();
        dodajTextArea();
        this.setVisible(true);
    }
 
    private void dodajIzbornik() {
        bar = new JMenuBar();
        setJMenuBar(bar);
        // ILI
        //this.getContentPane().add(bar, BorderLayout.EAST);
        bar.setVisible(true);
 
        JMenu fileMenu = new JMenu("File");
        bar.add(fileMenu);
        dodajFile(fileMenu);
 
        JMenu editMenu = new JMenu("Edit");
        bar.add(editMenu);
        dodajDatum(editMenu);
 
        JMenu help = new JMenu("Help");
        bar.add(help);
        dodajAbout(help);
    }
 
    private void dodajFile(JMenu menu) {
        JMenuItem miFile = new JMenuItem("Open");
        miFile.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
        miFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Otvori file");
            }
        });
 
        menu.add(miFile);
    }
 
    private void dodajDatum(JMenu editMenu) {
        JMenuItem miDatum = new JMenuItem("Datum");
        miDatum.setAccelerator(KeyStroke.getKeyStroke("F5"));
        miDatum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
                String datum = sdf.format(Calendar.getInstance().getTime());
                txt.append(datum + "\n");
            }
        });
 
        editMenu.add(miDatum);
    }
 
    private void dodajTextArea() {
        txt = new JTextArea();
        this.getContentPane().add(txt, BorderLayout.CENTER);
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    self.setTitle("Stisnuo si enter");
                }
                else
                    self.setTitle(String.valueOf(e.getKeyChar()));
            }
           
        });
        txt.setVisible(true);
    }
 
    private void dodajAbout(JMenu help) {
        JMenuItem item = new JMenuItem("About");
        item.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.CTRL_DOWN_MASK));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame about = new JFrame("About");
                about.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                about.setLocation(500, 500);
                about.setSize(100, 100);
                about.setVisible(true);
            }
        });
        help.add(item);
    }
 
}