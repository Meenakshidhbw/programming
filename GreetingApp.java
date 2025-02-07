import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 

public class GreetingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting App");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 150, 25);

        JTextField textField = new JTextField();
        textField.setBounds(180, 50, 150, 25);

        JButton button = new JButton("Greet Me");
        button.setBounds(140, 100, 120, 30);

        JLabel greetingLabel = new JLabel("");
        greetingLabel.setBounds(50, 150, 300, 25);

        button.addActionListener(e -> {
            String name = textField.getText();
            if (!name.isEmpty()) {
                greetingLabel.setText("Hello, " + name + "!");
            } else {
                greetingLabel.setText("Please enter your name.");
            }
        });

    
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(greetingLabel);


        frame.setVisible(true);
    }
}
