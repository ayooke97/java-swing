import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class modul1 {
    public static void main(String[] args) {
        JPanel header = new JPanel();
        header.setBounds(0, -20, 750, 250);
        header.setBackground(Color.red);
        header.setLayout(new FlowLayout());
        JFrame frame = new JFrame();
        frame.setTitle("Modul 1");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(750,500);
        frame.getContentPane().setBackground(Color.white);
        frame.add(header);
        frame.addMouseListener(new MouseListener(){
            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("X : " + x + " Y : " + y);
                
            }
        });
    }
}
