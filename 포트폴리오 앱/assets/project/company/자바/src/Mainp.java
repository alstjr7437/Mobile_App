import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JButton;

public class Mainp extends JFrame {
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainp frame = new Mainp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Mainp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setSize(1000,800);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel labelname = new JLabel("±èÁ¤¹Î");
		labelname.setFont(new Font("±¼¸²", Font.PLAIN, 70));
		labelname.setBounds(98, 81, 210, 154);
		contentPane.add(labelname);
		
		JButton btning = new JButton("ºÎ¼­º° ÇÁ·ÎÁ§Æ® ÁøÇàµµ");
		btning.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btning.setBounds(539, 92, 375, 95);
		contentPane.add(btning);
		
		JButton btndno = new JButton("ºÎ¼­ °ü¸®");
		btndno.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btndno.setBounds(539, 256, 375, 95);
		contentPane.add(btndno);
		
		JButton btnenp = new JButton("Á÷¿ø °ü¸®");
		btnenp.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnenp.setBounds(539, 418, 375, 95);
		contentPane.add(btnenp);
		
		JButton btncom = new JButton("È¸»ç °ü¸®");
		btncom.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btncom.setBounds(539, 579, 375, 95);
		contentPane.add(btncom);
		
		JButton btnchart = new JButton("°è ±Þ µµ");
		btnchart.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		btnchart.setBounds(127, 638, 182, 36);
		contentPane.add(btnchart);
		
		JButton btnlogout = new JButton("·Î±×¾Æ¿ô");
		btnlogout.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		btnlogout.setBounds(139, 679, 149, 36);
		contentPane.add(btnlogout);
		
		btning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectSelect().setVisible(true);
				setVisible(false);
			}
		});
		
		btndno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DnoSelect().setVisible(true);
				setVisible(false);
			}
		});
		
		btnenp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Emp().setVisible(true);
				setVisible(false);
			}
		});
		
		btncom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Company().setVisible(true);
				setVisible(false);
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
