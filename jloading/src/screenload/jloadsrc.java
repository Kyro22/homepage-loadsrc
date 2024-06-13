package screenload;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Font;

public class jloadsrc extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JProgressBar progressBar;
    private JLabel gif_1;
    private JLabel gif_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    jloadsrc frame = new jloadsrc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public jloadsrc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 803, 647);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        progressBar.setForeground(new Color(245, 245, 220));
        progressBar.setBackground(Color.LIGHT_GRAY);
        progressBar.setBounds(241, 430, 286, 21);
        progressBar.setStringPainted(true); // Enable progress string
        contentPane.add(progressBar);
        
        gif_2 = new JLabel("");
        gif_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\tenor-unscreen.gif"));
        gif_2.setBounds(147, 213, 410, 192);
        contentPane.add(gif_2);
        
        gif_1 = new JLabel("");
        gif_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\coffee-beans-coffee-cup-background_108231-260-Photoroom.png"));
        gif_1.setBounds(-93, 0, 977, 731);
        contentPane.add(gif_1);

        new Thread(new Runnable() {
            public void run() {
                updateProgressBar();
            }
        }).start();
    }

    public void updateProgressBar() {
        int i = 0;
        try {
            while (i <= 100) {
                progressBar.setValue(i);
                progressBar.setString("Loading " + i + "%");
                Thread.sleep(1000);
                i += 20;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
