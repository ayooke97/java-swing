import javax.swing.*;

import org.w3c.dom.Text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aktivitas2 extends JFrame implements ActionListener {
    private JTextField textField;

    public aktivitas2() {
        // Set the window title
        setTitle("Aktivitas 2");

        // Tambah Jpanel
        JPanel panel = new JPanel();

        // membuat button
        JButton button1 = new JButton("Halo sayang");
        JButton button2 = new JButton("Selamat Tinggal");
        JButton button3 = new JButton("Hapus");

        // Menambah action
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // menambah text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setColumns(20);

        // Menambah button dan text ke dalam panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(textField);

        // Menambah panel ke frame
        getContentPane().add(panel);

        // Konfigurasi frame
        setSize(600, 75);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        // Mendapatkan nilai dari button yang dipencet
        Object source = e.getSource();
        // mengatur teks ketika button dipencet
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            if (button.getText().equals("Halo sayang")) {
                textField.setText("Halo sayang, apa kabar?");
            } else if (button.getText().equals("Selamat Tinggal")) {
                textField.setText("Selamat Tinggal Sayang");
            } else if (button.getText().equals("Hapus")) {
                textField.setText("");
            }
        }
    }
    
    public static void main(String[] args) {
        new aktivitas2();
    }
}