package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {

        Font font = new Font("Arial", Font.PLAIN, 12);
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);
        panel.add(Box.createRigidArea(new Dimension(10, 20)));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));


        // Name Label and Text Field

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(font);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField nameField = new JTextField(15);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Age Label and Text Field

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(font);
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField ageField = new JTextField(15);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Email Label and Text Field

        JLabel emailLabel = new JLabel("E_mail");
        emailLabel.setFont(font);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField emailField = new JTextField(15);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Software Familiarity Level

        JLabel levelLabel = new JLabel("Level of familiarity with similar software");
        levelLabel.setFont(font);
        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        levelLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JRadioButton level1 = new JRadioButton("beginner");
        level1.setFont(font);
        level1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(font);
        level2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(font);
        level3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton level4 = new JRadioButton("Without acquaintance");
        level4.setFont(font);
        level4.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button

        JButton nextButton = new JButton("Next page");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.setFont(font);

        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
