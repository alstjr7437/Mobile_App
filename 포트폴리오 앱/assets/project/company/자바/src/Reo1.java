import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Reo1 extends JFrame {
	
	Login login = new Login();

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reo1 frame = new Reo1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		btnHome.setBounds(485, 10, 56, 40);
		contentPane.add(btnHome);
		
		JLabel lbldno = new JLabel("ÀÎ»çºÎ °³Æí");
		lbldno.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		lbldno.setBounds(35, 10, 236, 40);
		contentPane.add(lbldno);
		
		JButton btneval = new JButton("1) Æò°¡º°");
		btneval.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btneval.setBounds(35, 69, 138, 50);
		contentPane.add(btneval);
		
		JButton btndate = new JButton("2) ÀÔ»ç¼ø");
		btndate.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btndate.setBounds(35, 243, 138, 50);
		contentPane.add(btndate);
		
		JPanel panel = new JPanel();
		panel.setBounds(206, 79, 294, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Team1 = new JLabel("1ÆÀ");
		Team1.setBounds(12, 10, 57, 15);
		panel.add(Team1);
		
		JLabel Teamemp1_1 = new JLabel("");
		Teamemp1_1.setBounds(75, 10, 190, 15);
		panel.add(Teamemp1_1);
		
		JLabel Teamemp1_2 = new JLabel("");
		Teamemp1_2.setBounds(75, 27, 190, 15);
		panel.add(Teamemp1_2);
		
		JLabel Teamemp1_3 = new JLabel("");
		Teamemp1_3.setBounds(75, 45, 190, 15);
		panel.add(Teamemp1_3);
		
		JLabel Teamemp1_4 = new JLabel("");
		Teamemp1_4.setBounds(75, 61, 190, 15);
		panel.add(Teamemp1_4);
		
		JLabel Team2 = new JLabel("2ÆÀ");
		Team2.setBounds(12, 86, 57, 15);
		panel.add(Team2);
		
		JLabel Teamemp2_1 = new JLabel("");
		Teamemp2_1.setBounds(75, 86, 190, 15);
		panel.add(Teamemp2_1);
		
		JLabel Teamemp2_2 = new JLabel("");
		Teamemp2_2.setBounds(75, 103, 190, 15);
		panel.add(Teamemp2_2);
		
		JLabel Teamemp2_3 = new JLabel("");
		Teamemp2_3.setBounds(75, 121, 190, 15);
		panel.add(Teamemp2_3);
		
		JLabel Teamemp2_4 = new JLabel("");
		Teamemp2_4.setBounds(75, 137, 190, 15);
		panel.add(Teamemp2_4);
		
		JLabel Team3 = new JLabel("3ÆÀ");
		Team3.setBounds(12, 162, 57, 15);
		panel.add(Team3);
		
		JLabel Teamemp3_1 = new JLabel("");
		Teamemp3_1.setBounds(75, 162, 190, 15);
		panel.add(Teamemp3_1);
		
		JLabel Teamemp3_2 = new JLabel("");
		Teamemp3_2.setBounds(75, 179, 190, 15);
		panel.add(Teamemp3_2);
		
		JLabel Teamemp3_3 = new JLabel("");
		Teamemp3_3.setBounds(75, 197, 190, 15);
		panel.add(Teamemp3_3);
		
		JLabel Teamemp3_4 = new JLabel("");
		Teamemp3_4.setBounds(75, 213, 190, 15);
		panel.add(Teamemp3_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 0, 249, 76);
		panel.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(45, 76, 249, 76);
		panel.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(45, 152, 249, 76);
		panel.add(scrollPane_2);
		
		JButton btnSelect = new JButton("\uC120 \uD0DD");
		btnSelect.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		btnSelect.setBounds(407, 10, 66, 40);
		contentPane.add(btnSelect);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.emp == 0) {
					new Mainp().setVisible(true);
				} else {
					new Maine().setVisible(true);
				}
				setVisible(false);
			}
		});
		
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DnoReo().setVisible(true);
				setVisible(false);
			}
		});
		
	}
}
