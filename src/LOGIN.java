//Richard Padilla
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN {
    public JPanel loginsito;
    public JTextField textField1;
    public JPasswordField passwordField1;
    public JButton iniciarSesionButton;


    public LOGIN() {
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = passwordField1.getText();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos");
                } else {
                    if (username.equals("P") && password.equals("P")) {
                        JOptionPane.showMessageDialog(null, "            Login correcto! \n             BIENVENIDO");

                        JFrame frame = new JFrame("MENU");
                        FRAME2 Menu = new FRAME2();
                        frame.setContentPane(Menu.menu);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400, 600);
                        frame.setLocationRelativeTo(null);
                        frame.pack();
                        frame.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Correo o Contraseña Incorrecta!");
                    }
                }
            }
        });
    }
}
