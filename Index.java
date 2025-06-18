import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HoverEffect {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Hover Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Hover Over Me");

        // Default and hover colors
        Color normalColor = Color.LIGHT_GRAY;
        Color hoverColor = Color.CYAN;

        button.setBackground(normalColor);
        button.setOpaque(true);
        button.setBorderPainted(false);

        // Add mouse listener for hover effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(hoverColor);
            }

            public void mouseExited(MouseEvent evt) {
                button.setBackground(normalColor);
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
