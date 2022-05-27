import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel wLabel = new JLabel("Welcome!");

    WelcomePage(String userId) {

        wLabel.setBounds(0,0,200,35);
        wLabel.setFont(new Font(null, Font.ITALIC, 25));
        wLabel.setText("Welcome " + userId);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Welcome");

        frame.add(wLabel);
    }
}
