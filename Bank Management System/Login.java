

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame{

    Login() {
        setTitle("Automativ Teller Machine");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(i1);
        add(label);
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);

    }
    
    
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}
