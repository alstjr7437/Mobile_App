import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JButton;

public class Maine extends JFrame {
	private JPanel contentPane;
	private Image cal;
	private int w;
	private int h;
	
	Login login = new Login();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maine frame = new Maine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Maine() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setSize(1000,800);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel labelname2 = new JLabel(login.ddname[login.numB] + " " + login.dtname[login.numB] + " " + login.dposition[login.numB]) ;
		labelname2.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		labelname2.setBounds(60, 51, 375, 80);
		contentPane.add(labelname2);
		
		JLabel labelname = new JLabel(login.dename[login.numB]);
		labelname.setFont(new Font("±¼¸²", Font.PLAIN, 70));
		labelname.setBounds(129, 127, 233, 115);
		contentPane.add(labelname);
		
		JButton btnproject = new JButton("ºÎ¼­º° ÇÁ·ÎÁ§Æ® ÁøÇàµµ");
		btnproject.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnproject.setBounds(539, 92, 375, 95);
		contentPane.add(btnproject);
		
		JButton btnteam = new JButton("ÆÀ ¼¼ºÎ³»¿ë");
		btnteam.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnteam.setBounds(539, 256, 375, 95);
		contentPane.add(btnteam);
		
		JButton btnemp = new JButton("Á÷¿ø °ü¸®");
		btnemp.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnemp.setBounds(539, 418, 375, 95);
		contentPane.add(btnemp);
		
		JButton btninf = new JButton("°³ÀÎ Á¤º¸");
		btninf.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btninf.setBounds(539, 579, 375, 95);
		contentPane.add(btninf);
		
		JButton btnchart = new JButton("°è ±Þ µµ");
		btnchart.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		btnchart.setBounds(155, 642, 182, 36);
		contentPane.add(btnchart);
		
		JButton btnlogout = new JButton("·Î±×¾Æ¿ô");
		btnlogout.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		btnlogout.setBounds(167, 683, 149, 36);
		contentPane.add(btnlogout);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 256, 426, 376);
		contentPane.add(panel);

		
		btnproject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectSelect().setVisible(true);
				setVisible(false);
			}
		});
		
		btnteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Team().setVisible(true);
			}
		});
		
		btnemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Emp().setVisible(true);
				setVisible(false);
			}
		});
		
		btninf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EmpInf2().setVisible(true);
			}
		});
		
		btnchart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Chart().setVisible(true);
			}
		});

		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				setVisible(false);
			}
		});
	}
}
