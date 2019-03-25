package swingapi_jframe;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

public class SwingAPI_Primjeri extends JFrame {

    public SwingAPI_Primjeri(String naslov) throws HeadlessException {
        super(naslov);
        setLayout(new FlowLayout());
        createButton();
        createTextFieldAndArea();
        createCheckBox();
    }

    public static void main(String[] args) {
        //Stvaranje prozor objekta
        SwingAPI_Primjeri prozor = new SwingAPI_Primjeri("JFramePrimjer, JButtonPrimjer");
        //Što se dogodi kad kliknemo na x (zatvaranje prozora)
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //podesi veličinu prozora
        prozor.setSize(600, 400);
        //podesi lokaciju
        prozor.setLocation(200, 200);
        //prikaži prozor
        prozor.setVisible(true);

    }

    JButton prviGumb;
    JButton drugiGumb;
    JButton treciGumb;

    JLabel ime;
    JTextField txtIme;
    JLabel opis;
    JTextArea txtOpis;

    JCheckBox zgGumb;
    JCheckBox stGumb;
    JCheckBox riGumb;
    JCheckBox osGumb;

    private void createButton() {
        //kreiranje gumbića i dodavanje istih na prozor
        prviGumb = new JButton("Prvi gumb");
        drugiGumb = new JButton("Drugi gumb");
        treciGumb = new JButton("Treći gumb");

        this.getContentPane().add(prviGumb);
        this.getContentPane().add(drugiGumb);
        this.getContentPane().add(treciGumb);
        //promijeni način prikazivanja komponenti
    }

    private void createTextFieldAndArea() {
        //kreiranje labele i dodavanje iste na prozor
        ime = new JLabel("Ime:");
        txtIme = new JTextField("Ovdje upišite ime:", 30);
        opis = new JLabel("Opis:");
        txtOpis = new JTextArea("Ovdje upišite opis:", 6, 30);

        this.getContentPane().add(ime);
        this.getContentPane().add(txtIme);
        this.getContentPane().add(opis);
        this.getContentPane().add(txtOpis);
    }

    private void createCheckBox() {
        //Create the check boxes.
        zgGumb = new JCheckBox("Zagreb");
        zgGumb.setSelected(true);

        stGumb = new JCheckBox("Split");
        stGumb.setSelected(false);

        riGumb = new JCheckBox("Rijeka");
        riGumb.setSelected(true);

        osGumb = new JCheckBox("Osijek");
        osGumb.setSelected(false);

        this.getContentPane().add(zgGumb);
        this.getContentPane().add(stGumb);

    }

}
