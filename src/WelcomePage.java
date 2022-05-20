import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel wLable = new JLabel("Welcome!");

    WelcomePage(String userId) {

        wLable.setBounds(0,0,200,35);
        wLable.setFont(new Font(null, Font.ITALIC, 25));
        wLable.setText("Welcome " + userId);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Welcome");

        frame.add(wLable);
    }
}
