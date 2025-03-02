package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        Font font = new Font("Arial", Font.PLAIN, 12);
        // Create and configure the panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create thank you label

        JLabel thankYouLabel = new JLabel("Thank you for your support!");
        thankYouLabel.setFont(font);
        thankYouLabel.setAlignmentY(Component.CENTER_ALIGNMENT);
        thankYouLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);
        thankYouLabel.setVerticalAlignment(SwingConstants.CENTER);

        // Add components to the panel
        panel.add(thankYouLabel , BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
