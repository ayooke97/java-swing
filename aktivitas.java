import java.awt.*;
import javax.swing.*;

public class aktivitas {

    public static void main(String[] args) {
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setBounds(0, 0, 750, 50);
        panel1.setLayout(new BorderLayout());

        JLabel label1 = new JLabel();
        label1.setText("Login");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setHorizontalAlignment(JLabel.CENTER);

        JPanel opanel2 = new JPanel();
        opanel2.setBackground(new Color(255, 255, 255));
        opanel2.setBounds(0, 51, 750, 700);
        FlowLayout flpanel2 = new FlowLayout();
        flpanel2.setHgap(30);
        opanel2.setLayout(flpanel2);
        
        JPanel ipanel2 = new JPanel();
        ipanel2.setBackground(Color.white);
        JLabel username = new JLabel();
        username.setText("username");
        username.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField txt_username = new JTextField();
        txt_username.setPreferredSize(new Dimension(200, 24));
        txt_username.setBackground(new Color(255, 255, 255));
        JLabel pass = new JLabel();
        pass.setText("password");
        pass.setFont(new Font("Arial", Font.PLAIN, 16));

        JPasswordField txt_pass = new JPasswordField();
        txt_pass.setPreferredSize(new Dimension(200,24));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(panel1);
        frame.add(opanel2);
        frame.add(ipanel2);
        panel1.add(label1);
        opanel2.add(username);
        opanel2.add(ipanel2);
        ipanel2.add(txt_username);
        ipanel2.add(pass);
        ipanel2.add(txt_pass);

    }
}