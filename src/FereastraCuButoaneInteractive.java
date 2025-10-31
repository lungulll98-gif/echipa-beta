
import javax.swing.*;
import java.awt.event.*;

public class FereastraCuButoaneInteractive {
    public static void main(String[] args) {

        // Creăm fereastra principală
        JFrame fereastra = new JFrame("Aeroportul Chișinău");
        fereastra.setSize(420, 350);
        fereastra.setLayout(null);
        fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Eticheta principală
        JLabel mesaj = new JLabel("<html><center>Bine ați venit în meniul principal!<br>Dă clic pe categoria preferată!</center></html>");
        mesaj.setBounds(50, 40, 320, 60);

        // Butoane principale
        JButton buton1 = new JButton("VIP Class");
        buton1.setBounds(40, 120, 140, 40);

        JButton buton2 = new JButton("Business Class");
        buton2.setBounds(210, 120, 140, 40);

        JButton buton3 = new JButton("Vizitator/Calator");
        buton3.setBounds(40, 180, 140, 40);

        JButton buton4 = new JButton("Econom Class");
        buton4.setBounds(210, 180, 140, 40);

        // Butoane secundare (inițial invizibile)
        JButton exit = new JButton("Exit");
        exit.setBounds(250, 250, 100, 40);
        exit.setVisible(false);

        JButton meniu = new JButton("Meniu Principal");
        meniu.setBounds(50, 250, 140, 40);
        meniu.setVisible(false);

        // Acțiuni la clic pentru categoriile principale
        ActionListener categorieListener = eveniment -> {
            String optiune = ((JButton) eveniment.getSource()).getText();
            buton1.setVisible(false);
            buton2.setVisible(false);
            buton3.setVisible(false);
            buton4.setVisible(false);
            exit.setVisible(true);
            meniu.setVisible(true);

            switch (optiune) {
                case "Vizitator/Calator":
                    mesaj.setText("<html>Bună ziua!<br>Ați ales categoria Vizitator/Calator!<br>Acces: Sala de așteptare.</html>");
                    break;
                case "Econom Class":
                    mesaj.setText("<html>Bună ziua!<br>Ați ales categoria Econom Class!<br>Acces: Sala de așteptare și bufet.</html>");
                    break;
                case "Business Class":
                    mesaj.setText("<html>Bună ziua!<br>Ați ales Business Class!<br>Acces:<br>1. Sala de așteptare<br>2. Sala de conferințe<br>3. Business Lounge</html>");
                    break;
                case "VIP Class":
                    mesaj.setText("<html>Bună ziua!<br>Ați ales VIP Class!<br>Acces complet la toate serviciile aeroportului!</html>");
                    break;
            }
        };

        buton1.addActionListener(categorieListener);
        buton2.addActionListener(categorieListener);
        buton3.addActionListener(categorieListener);
        buton4.addActionListener(categorieListener);

        // Butonul Exit
        exit.addActionListener(eveniment -> {
            System.exit(0);
        });

        // Butonul Meniu Principal
        meniu.addActionListener(eveniment -> {
            mesaj.setText("<html><center>Bine ați venit în meniul principal!<br>Dă clic pe categoria preferată!</center></html>");
            buton1.setVisible(true);
            buton2.setVisible(true);
            buton3.setVisible(true);
            buton4.setVisible(true);
            exit.setVisible(false);
            meniu.setVisible(false);
        });

        // Adăugăm elementele
        fereastra.add(mesaj);
        fereastra.add(buton1);
        fereastra.add(buton2);
        fereastra.add(buton3);
        fereastra.add(buton4);
        fereastra.add(exit);
        fereastra.add(meniu);

        // Afișăm fereastra
        fereastra.setVisible(true);
    }
}