import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class RegisterPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Register");
    JTextField userIdField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userLabel = new JLabel("UserID: ");
    JLabel userPassword = new JLabel("Password: ");

    HashMap<String, String> registerInfo = new HashMap<String, String>();

    public RegisterPage(HashMap<String, String> registerInfoOriginal) {

        registerInfo = registerInfoOriginal;

        userLabel.setBounds(50, 100, 75, 25);

        userPassword.setBounds(50, 150, 75, 25);

        userIdField.setBounds(125, 100, 250, 25);

        passwordField.setBounds(125, 150, 250, 25);

        button.setBounds(125, 200, 100, 25);
        button.addActionListener(this);
        button.setFocusable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Register");
        frame.getContentPane().setBackground(Color.getColor("#F0F8FF"));

        frame.add(userLabel);
        frame.add(userPassword);
        frame.add(userIdField);
        frame.add(passwordField);
        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            registerInfo.put(userIdField.getText(), new String(passwordField.getPassword()));
            frame.dispose();
        }
        // after register, the user can login
        LoginPage loginPage = new LoginPage(registerInfo);
    }
}
