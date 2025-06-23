import java.awt.*;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();
        tf.setEditable(false);
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        f.add(tf, BorderLayout.NORTH);

        JPanel p = new JPanel(new GridLayout(4, 4));
        f.add(p, BorderLayout.CENTER);

        String[] texts = {"7","8","9","/",
                          "4","5","6","*",
                          "1","2","3","-",
                          "0","C","=","+"};

        for (String t : texts) {
            JButton b = new JButton(t);
            b.setFont(new Font("Arial", Font.BOLD, 18));
            p.add(b);
            b.addActionListener(e -> {
                String cmd = b.getText();
                if (cmd.equals("C")) tf.setText("");
                else if (cmd.equals("=")) {
                    try {
                        tf.setText("" + new javax.script.ScriptEngineManager()
                            .getEngineByName("JavaScript").eval(tf.getText()));
                    } catch (Exception ex) {
                        tf.setText("Error");
                    }
                } else {
                    tf.setText(tf.getText() + cmd);
                }
            });
        }

        f.setSize(250, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
