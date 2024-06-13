package forcaffee;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

public class caffeesystem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caffeesystem frame = new caffeesystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public caffeesystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 654);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(255, 235, 205));
		btnNewButton.setBounds(90, 130, 104, 43);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(87, 179, 632, 324);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome");
		lblNewLabel_3.setFont(new Font("Brush Script MT", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(71, 11, 74, 14);
		panel.add(lblNewLabel_3);
		
		JTextPane txtpnZdvsdbhbnb = new JTextPane();
		txtpnZdvsdbhbnb.setBackground(new Color(255, 235, 205));
		txtpnZdvsdbhbnb.setEditable(false);
		txtpnZdvsdbhbnb.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		txtpnZdvsdbhbnb.setText("Welcome to KAPE DE CABUYAO, your premier destination for all things coffee. From the rich aroma of our freshly roasted beans to the expertly crafted cups that will transport you to a world of pure delight, we're dedicated to bringing you the ultimate coffee experience. Whether you're a coffee connoisseur or just looking for a pick-me-up, our website is designed to make it easy for you to discover, learn about, and enjoy the best coffee in the world. With a range of specialty blends, single-origin coffees, and expertly curated gift sets, we've got everything you need to elevate your daily grind and make every moment a little brighter.");
		txtpnZdvsdbhbnb.setBounds(10, 30, 310, 266);
		panel.add(txtpnZdvsdbhbnb);
		
		JButton btnNewButton_1 = new JButton("More");
		btnNewButton_1.setBackground(new Color(255, 235, 205));
		btnNewButton_1.setBounds(71, 292, 63, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(152, -47, 457, 382);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\R-removebg-preview.png"));
		
		JButton btnContact = new JButton("Contacts");
		btnContact.setBackground(new Color(255, 235, 205));
		btnContact.setBounds(191, 130, 104, 43);
		contentPane.add(btnContact);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBackground(new Color(255, 235, 205));
		btnMenu.setBounds(291, 130, 104, 43);
		contentPane.add(btnMenu);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBackground(new Color(255, 235, 205));
		btnAbout.setBounds(394, 130, 104, 43);
		contentPane.add(btnAbout);
		
		textField = new JTextField();
		textField.setBounds(503, 134, 214, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kape De Cabuyao");
		lblNewLabel.setForeground(new Color(205, 133, 63));
		lblNewLabel.setBackground(new Color(210, 180, 140));
		lblNewLabel.setFont(new Font("Brush Script MT", Font.BOLD, 40));
		lblNewLabel.setBounds(90, 34, 305, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SMOOTH COFFE \r\n");
		lblNewLabel_1.setForeground(new Color(210, 180, 140));
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(191, 68, 147, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\coffee-beans-coffee-cup-background_108231-260-Photoroom.png"));
		lblNewLabel_4.setBounds(0, 130, 951, 503);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
