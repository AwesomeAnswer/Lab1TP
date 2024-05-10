

import javax.swing.*;
import java.awt.*;

class StringApp {
    public static void main(String[] args) {


        JFrame frame = new JFrame("String Library App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);


        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel str1Label = new JLabel("String 1:");
        JTextField str1Text = new JTextField(20);
        JLabel str2Label = new JLabel("String 2:");
        JTextField str2Text = new JTextField(20);
        JButton checkButton = new JButton("Check");


        inputPanel.add(str1Label);
        inputPanel.add(str1Text);
        inputPanel.add(str2Label);
        inputPanel.add(str2Text);
        inputPanel.add(new JLabel());
        inputPanel.add(checkButton);

        mainPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(resultLabel, BorderLayout.SOUTH);


        frame.add(mainPanel);


        checkButton.addActionListener(e -> {
            String str1 = str1Text.getText();
            String str2 = str2Text.getText();

            StringChecker stringLibrary = new StringChecker();
            boolean canForm = stringLibrary.checkString(str1, str2);

            if (canForm) {
                resultLabel.setText("String 1 can be formed from String 2.");
            } else {
                resultLabel.setText("String 1 cannot be formed from String 2.");
            }
        });

        frame.setVisible(true);
    }
}
