

import java.awt.*;
import javax.swing.*;

public class aboutUs extends JFrame {

	private final JPanel contentPane;

	public static void main(String[] args) {
		new aboutUs().setVisible(true);
	}

	public aboutUs() {

		super("About Us");
		setBackground(new Color(173, 216, 230));
		setBounds(500, 250, 700, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l3 = new JLabel("Library Management System");
		l3.setFont(new Font("Bookman Old Style", Font.BOLD , 34));
		l3.setBounds(39, 40, 531, 55);
		contentPane.add(l3);

		JLabel l5 = new JLabel("vz 2.1");
		l5.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		l5.setBounds(557, 60, 100, 21);
		contentPane.add(l5);

		JLabel l6 = new JLabel("Developed By : Japneet Singh");
		l6.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		l6.setBounds(70, 122, 600, 35);
		contentPane.add(l6);

		JLabel l7 = new JLabel("Connect with me on :- ");
		l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l7.setBounds(57, 208, 600, 34);
		contentPane.add(l7);

		JLabel l8 = new JLabel("Mobile No.:9310158874");
		l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l8.setBounds(99, 241, 600, 34);
		contentPane.add(l8);
		

		JLabel l9 = new JLabel("G-mail:japneetbindra2@gmail.com");
		l9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l9.setBounds(99, 331, 600, 34);
		contentPane.add(l9);

		contentPane.setBackground(Color.WHITE);
	}

}