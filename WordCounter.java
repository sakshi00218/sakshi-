import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Word Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create JTextArea for input
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a button
        JButton countButton = new JButton("Count Words");
        frame.add(countButton, BorderLayout.SOUTH);

        // Label to display word count
        JLabel resultLabel = new JLabel("Word Count: 0", SwingConstants.CENTER);
        frame.add(resultLabel, BorderLayout.NORTH);

        // Add action listener to button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();
                if (text.isEmpty()) {
                    resultLabel.setText("Word Count: 0");
                } else {
                    String[] words = text.split("\\s+"); // Split by spaces
                    resultLabel.setText("Word Count: " + words.length);
                }
            }
        });

        // Set frame visible
        frame.setVisible(true);
    }
}
