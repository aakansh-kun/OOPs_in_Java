import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JTextField userTextField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);

        frame.add(userLabel);
        frame.add(userTextField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(new JLabel()); 
        frame.add(loginButton);
        frame.add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                    messageLabel.setText("");
                } else {
                    messageLabel.setText("Invalid username or password.");
                }
            }
        });

        frame.setVisible(true);
    }
}
