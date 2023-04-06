import javax.swing.*;
import java.awt.*;

public class Latihan extends JFrame {
    private JLabel nameLabel, ageLabel, genderLabel, emailLabel, phoneLabel, addressLabel, passwordLabel;
    private JTextField nameText, ageText, emailText, phoneText, addressText;
    private JPasswordField passwordText;
    private JRadioButton maleButton, femaleButton;
    private JButton submitButton, clearButton;
    private JPanel personalPanel, loginPanel;

    public Latihan() {
        setTitle("My Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        personalPanel = new JPanel();
        personalPanel.setLayout(new GridLayout(7, 2));

        nameLabel = new JLabel("Name: ");
        nameText = new JTextField();

        ageLabel = new JLabel("Age: ");
        ageText = new JTextField();

        genderLabel = new JLabel("Gender: ");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        emailLabel = new JLabel("Email: ");
        emailText = new JTextField();

        phoneLabel = new JLabel("Phone: ");
        phoneText = new JTextField();

        addressLabel = new JLabel("Address: ");
        addressText = new JTextField();

        passwordLabel = new JLabel("Password: ");
        passwordText = new JPasswordField();

        personalPanel.add(nameLabel);
        personalPanel.add(nameText);
        personalPanel.add(ageLabel);
        personalPanel.add(ageText);
        personalPanel.add(genderLabel);
        personalPanel.add(maleButton);
        personalPanel.add(new JLabel(""));
        personalPanel.add(femaleButton);
        personalPanel.add(emailLabel);
        personalPanel.add(emailText);
        personalPanel.add(phoneLabel);
        personalPanel.add(phoneText);
        personalPanel.add(addressLabel);
        personalPanel.add(addressText);
        personalPanel.add(passwordLabel);
        personalPanel.add(passwordText);

        loginPanel = new JPanel();
        loginPanel.setLayout(new FlowLayout());

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        loginPanel.add(submitButton);
        loginPanel.add(clearButton);

        add(personalPanel, BorderLayout.NORTH);
        add(loginPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Latihan().setVisible(true);
            }
        });
    }
}
