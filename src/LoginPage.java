import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton lButton = new JButton("Login");
    JButton rButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userLabel = new JLabel("UserID: ");
    JLabel userPassword = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    public LoginPage(HashMap<String, String > logininfoOriginal) {

        logininfo = logininfoOriginal;

        userLabel.setBounds(50, 100, 75, 25);

        userPassword.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIdField.setBounds(125, 100, 250, 25);

        passwordField.setBounds(125, 150, 250, 25);

        lButton.setBounds(125, 200, 100, 25);
        lButton.addActionListener(this);
        lButton.setFocusable(false);

        rButton.setBounds(225, 200, 100, 25);
        rButton.addActionListener(this);
        rButton.setFocusable(false);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Login");
        //frame.getContentPane().setBackground(Color.PINK);

        frame.add(userLabel);
        frame.add(userPassword);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(passwordField);
        frame.add(lButton);
        frame.add(rButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rButton) {
            userIdField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == lButton) {

            String userId = userIdField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (logininfo.containsKey(userId)) {
                if (logininfo.get(userId).equals(password)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login was successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userId);
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong Password");
                }
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Wrong Username");
            }
        }
    }
}
