package telusko;
import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        JButton button = new JButton("Clicked");
        button.setBounds(100, 100, 140, 50);
        j.add(button);

        // JRadioButton
        JRadioButton rb = new JRadioButton("A");
        JRadioButton rb2 = new JRadioButton("B");
        rb.setBounds(100, 200, 100, 50); // Changed location to avoid overlap
        rb2.setBounds(100, 250, 100, 50); // Changed location to avoid overlap
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        j.add(rb);
        j.add(rb2);

        // JTextArea
        JTextArea jt = new JTextArea(5, 20); // Rows and columns specified
        jt.setBounds(100, 300, 200, 100); // Set bounds for JTextArea
        j.add(jt);

        j.setLayout(new FlowLayout()); // Setting layout manager to FlowLayout
        j.setSize(400, 500); // Set the size of the JFrame
        j.setVisible(true); // Make the JFrame visible
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when JFrame is closed
    }
}
