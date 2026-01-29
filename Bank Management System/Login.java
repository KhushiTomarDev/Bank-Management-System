

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame{

    Login() {
        setTitle("Automativ Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(i1);
        label.setBounds(70,10,100,100);
        add(label); 

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardNum = new JLabel("cardNumber");
        cardNum.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNum.setBounds(120, 150, 150, 30);
        add(cardNum);

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 38));
        pin.setBounds(300, 220, 250, 30);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 150, 250, 30);
        add(pinTextField);

        getContentPane().setBackground(Color.CYAN);

        setSize(800,400);
        setVisible(true);
        setLocation(350,200);

    }
    
    
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}
