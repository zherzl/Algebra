package swingapi_jframe;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingAPI_dogadaji extends JFrame implements ActionListener {

    JButton mojGumb;

    public SwingAPI_dogadaji(String naslov) {
        super(naslov);
        mojGumb = new JButton("Klikni me");
        this.setLayout(new FlowLayout());
        this.getContentPane().add(mojGumb);
        //registriranje slušača
        mojGumb.addActionListener(this);
    }

    public static void main(String[] args) {
        //Stvaranje prozor objekta
        SwingAPI_dogadaji prozor = new SwingAPI_dogadaji("DogadajPrimjer");
        //Što se dogodi kad kliknemo na x (zatvaranje prozora)
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //podesi veličinu prozora
        prozor.setSize(400, 200);
        //podesi lokaciju
        prozor.setLocation(200, 200);
        //prikaži prozor
        prozor.setVisible(true);

    }

    //metoda iz sučelja. U njoj definiramo ponašanje programa nakon što se dogodi
    //događaj koji "osluškujemo" na objektu kod kojeg smo se registrirali
    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(this, "Pozdrav, pritisnuo si gumb, zato me vidiš ;)");

    }

}
