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
                    if (username.equals("PADILLA") && password.equals("PADILLA123")) {
                        JOptionPane.showMessageDialog(null, "            Login correcto! \n             BIENVENIDO");
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo o Contraseña Incorrecta!");
                    }
                }
            }
        });
    }
}
