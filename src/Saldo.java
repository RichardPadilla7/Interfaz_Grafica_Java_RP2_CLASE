import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    public JButton MENUButton;
    public JPanel saldo;
    public JLabel Mostrar;


    public Saldo() {

        double valorInicial = 5000;
        Mostrar.setText("$" + valorInicial);





        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("MENU");
                FRAME2 Menu = new FRAME2();
                frame.setContentPane(Menu.menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 600);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);

            }
        });
    }
}
