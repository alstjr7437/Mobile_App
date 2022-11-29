import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

public class DnoCon2 extends JFrame {

	Login login = new Login();
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnTeam1;
	private JButton btnTeam2;
	private JButton btnTeam3;
	private JLabel lblNewLabel_1;
	private JLabel lblTeam;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DnoCon2 frame = new DnoCon2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DnoCon2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setBounds(449, 30, 52, 31);
		contentPane.add(btnHome);
		
		JButton btndnoSelect = new JButton("ºÎ¼­ ¼±ÅÃ");
		btndnoSelect.setBounds(318, 30, 100, 31);
		contentPane.add(btndnoSelect);
		
		JLabel lblDname = new JLabel(" ±â  È¹  ºÎ");
		lblDname.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		lblDname.setBounds(31, 18, 524, 74);
		contentPane.add(lblDname);
		
		lblTeam = new JLabel("1ÆÀ ºÎÀå : ¹Ú¼±Çü");
		lblTeam.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblTeam.setBounds(64, 102, 300, 90);
		contentPane.add(lblTeam);
		
		JButton btnProject1 = new JButton("\uD300 \uC138\uBD80 \uB0B4\uC6A9");
		btnProject1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnProject1.setBounds(392, 119, 120, 68);
		contentPane.add(btnProject1);
		
		JLabel lblTeam2 = new JLabel("2ÆÀ ºÎÀå : ¹ÚÁö¼ö");
		lblTeam2.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblTeam2.setBounds(64, 218, 300, 90);
		contentPane.add(lblTeam2);
		
		JButton btnProject2 = new JButton("\uD300 \uC138\uBD80 \uB0B4\uC6A9");
		btnProject2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnProject2.setBounds(392, 235, 120, 68);
		contentPane.add(btnProject2);
		
		JLabel lblTeam3 = new JLabel("3ÆÀ ºÎÀå : ¾È¼ºÈ¯");
		lblTeam3.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblTeam3.setBounds(64, 342, 300, 90);
		contentPane.add(lblTeam3);
		
		JButton btnProject3 = new JButton("\uD300 \uC138\uBD80 \uB0B4\uC6A9");
		btnProject3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnProject3.setBounds(392, 359, 120, 68);
		contentPane.add(btnProject3);
		
		JLabel lblNewLabel_2 = new JLabel("\uD604\uC7AC \uC9C4\uD589 \uD504\uB85C\uC81D\uD2B8 : \uBD80\uC0B0\uC2DC \uCF5C\uB77C\uBCF4 \uD3EC\uC2A4\uD130 \uC81C\uC791 ");
		lblNewLabel_2.setBounds(100, 168, 264, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uD604\uC7AC \uC9C4\uD589 \uD504\uB85C\uC81D\uD2B8 : 2022\uB144\uB3C4 \uD68C\uC0AC \uC77C\uC815");
		lblNewLabel_2_1.setBounds(100, 286, 264, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uD604\uC7AC \uC9C4\uD589 \uD504\uB85C\uC81D\uD2B8 : ");
		lblNewLabel_2_2.setBounds(100, 408, 227, 24);
		contentPane.add(lblNewLabel_2_2);
		
		btndnoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DnoSelect().setVisible(true);
				setVisible(false);
			}
		});
		
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
		btnProject1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new Team().setVisible(true);
			}
		});
		
		btnProject2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new Team().setVisible(true);
			}
		});
		
		btnProject3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new Team().setVisible(true);
			}
		});
	}
}
