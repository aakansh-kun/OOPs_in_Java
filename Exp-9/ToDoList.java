import java.awt.*;
import javax.swing.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame f = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JTextField taskField = new JTextField();
        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        addBtn.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeBtn.addActionListener(e -> {
            int index = list.getSelectedIndex();
            if (index != -1) model.remove(index);
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(taskField, BorderLayout.CENTER);
        panel.add(addBtn, BorderLayout.EAST);

        f.add(panel, BorderLayout.NORTH);
        f.add(new JScrollPane(list), BorderLayout.CENTER);
        f.add(removeBtn, BorderLayout.SOUTH);

        f.setSize(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
