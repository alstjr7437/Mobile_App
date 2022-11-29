import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Team extends JFrame {

	private JPanel contentPane;
	
	Login login = new Login();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Team frame = new Team();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Team() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setBounds(569, 10, 52, 31);
		contentPane.add(btnHome);
		
		JLabel lblTname = new JLabel("\uC7AC\uC815\uBD80 1\uD300");
		lblTname.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblTname.setBounds(30, 26, 196, 41);
		contentPane.add(lblTname);
		
		JLabel lblHu = new JLabel("\uC778 \uC6D0");
		lblHu.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblHu.setBounds(51, 104, 82, 31);
		contentPane.add(lblHu);
		
		JLabel lblHu1 = new JLabel("\uBD80\uC7A5");
		lblHu1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu1.setBounds(155, 104, 53, 26);
		contentPane.add(lblHu1);
		
		JLabel lblHu2 = new JLabel("\uACFC\uC7A5");
		lblHu2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu2.setBounds(155, 154, 53, 26);
		contentPane.add(lblHu2);
		
		JLabel lblHu3 = new JLabel("\uC8FC\uC784");
		lblHu3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu3.setBounds(155, 202, 53, 26);
		contentPane.add(lblHu3);
		
		JLabel lblHu4 = new JLabel("\uC0AC\uC6D0");
		lblHu4.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu4.setBounds(155, 253, 53, 26);
		contentPane.add(lblHu4);
		
		JButton btnName = new JButton("\uAC15 \uC9C0 \uC6D0");
		btnName.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName.setBounds(210, 107, 95, 23);
		contentPane.add(btnName);
		
		JButton btnName_1 = new JButton("\uBC15 \uC900 \uC218");
		btnName_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName_1.setBounds(210, 157, 95, 23);
		contentPane.add(btnName_1);
		
		JButton btnName_2 = new JButton("\uACFD \uB300 \uC740");
		btnName_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName_2.setBounds(210, 205, 95, 23);
		contentPane.add(btnName_2);
		
		JButton btnName_3 = new JButton("\uC774 \uACBD \uBBFC");
		btnName_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName_3.setBounds(210, 256, 95, 23);
		contentPane.add(btnName_3);
		
		JLabel lblye = new JLabel("\uC774 \uB825");
		lblye.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblye.setBounds(51, 301, 95, 41);
		contentPane.add(lblye);
		
		textField = new JTextField();
		textField.setText("2009\uB144 \uC7AC\uC815 \uAD00\uB9AC \uD68C\uC758 (2009/01/01 ~ 2009/02/01)");
		textField.setColumns(10);
		textField.setBounds(51, 358, 442, 31);
		contentPane.add(textField);
		
		JButton btnPrj1 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnPrj1.setBounds(524, 358, 97, 31);
		contentPane.add(btnPrj1);
		
		textField_1 = new JTextField();
		textField_1.setText("2013\uB144 \uC5F0\uB9D0 \uC7AC\uC815 \uD68C\uC758(2013/11/01 ~ 2013/12/31)");
		textField_1.setColumns(10);
		textField_1.setBounds(51, 407, 442, 31);
		contentPane.add(textField_1);
		
		JButton btnPrj2 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnPrj2.setBounds(524, 407, 97, 31);
		contentPane.add(btnPrj2);
		
		textField_2 = new JTextField();
		textField_2.setText("2015\uB144 \uC5EC\uB984 \uC6CC\uD06C\uC20D \uC7AC\uC815 \uD68C\uC758(2015/03/03 ~ 2015/04/20)");
		textField_2.setColumns(10);
		textField_2.setBounds(51, 453, 442, 31);
		contentPane.add(textField_2);
		
		JButton btnPrj3 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnPrj3.setBounds(524, 453, 97, 31);
		contentPane.add(btnPrj3);
		
		textField_3 = new JTextField();
		textField_3.setText("2016\uB144 \uC7AC\uC815 \uAD00\uB9AC \uD68C\uC758(2016/01/01 ~ 2016/02/01)");
		textField_3.setColumns(10);
		textField_3.setBounds(51, 502, 442, 31);
		contentPane.add(textField_3);
		
		JButton btnPrj1_1 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnPrj1_1.setBounds(524, 502, 97, 31);
		contentPane.add(btnPrj1_1);
		
		textField_4 = new JTextField();
		textField_4.setText("2021\uB144 \uC5F0\uB9D0 \uC131\uACFC\uAE08 \uC9C0\uAE09(2021/11/01 ~ 2021/12/31)");
		textField_4.setColumns(10);
		textField_4.setBounds(51, 551, 442, 31);
		contentPane.add(textField_4);
		
		JButton btnPrj2_1 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnPrj2_1.setBounds(524, 551, 97, 31);
		contentPane.add(btnPrj2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(51, 597, 442, 31);
		contentPane.add(textField_5);
		
		JButton btnPrj3_1 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj3_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnPrj3_1.setBounds(524, 597, 97, 31);
		contentPane.add(btnPrj3_1);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC \uD558\uB294 \uC77C");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel.setBounds(421, 63, 167, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC5F0\uB9D0 \uC131\uACFC\uAE08 \uAD00\uB828 \uD504\uB85C\uC81D\uD2B8");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(375, 114, 252, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2022\uB144 \uC7AC\uC815 \uD68C\uC758");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(375, 154, 252, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC2E0\uC785\uC0AC\uC6D0 \uC5F0\uBD09 \uAC80\uD1A0");
		lblNewLabel_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(375, 197, 252, 18);
		contentPane.add(lblNewLabel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(354, 65, 269, 214);
		contentPane.add(scrollPane);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnPrj2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectCon().setVisible(true);
			}
		});
	}
}
