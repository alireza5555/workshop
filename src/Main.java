import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Font font = new Font("Arial", Font.PLAIN, 12);

        // Create and configure the main frame
        JFrame frame = new JFrame("Survey form");
        frame.setFont(font);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create and configure the main panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("Survey form");
        title.setFont(font);
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(font);
        startButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(startButton, BorderLayout.CENTER);

        frame.add(panel, BorderLayout.CENTER);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
