//GridLayoutPrimjer.java
package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutPrimjer extends JFrame {

    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;

    JButton btn9;

    public GridLayoutPrimjer(String naziv) {
        super(naziv);
// postavi GridLayout upravitelj zadataka
        setLayout(new GridLayout(3, 3));
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
        getContentPane().add(btn4);
        getContentPane().add(btn5);
        getContentPane().add(btn6);
        getContentPane().add(btn7);
        getContentPane().add(btn8);
        getContentPane().add(btn9);
        setBounds(400, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutPrimjer glp = new GridLayoutPrimjer("GridLayout Primjer");
    }
}
