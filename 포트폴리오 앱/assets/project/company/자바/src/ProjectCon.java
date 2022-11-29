import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

public class ProjectCon extends JFrame {

	private JPanel contentPane;
	
	Login login = new Login();
	private JTextField textField_1;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectCon frame = new ProjectCon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProjectCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setBounds(922, 10, 52, 31);
		contentPane.add(btnHome);
		
		JButton btnSelect = new JButton("ÁøÇà ÇÁ·ÎÁ§Æ®");
		btnSelect.setBounds(658, 10, 125, 31);
		contentPane.add(btnSelect);
		
		JButton btnSelect_2 = new JButton("°ú°Å ÇÁ·ÎÁ§Æ®");
		btnSelect_2.setBounds(795, 10, 115, 31);
		contentPane.add(btnSelect_2);
		
		JButton btnTeam = new JButton("1ÆÀ");
		btnTeam.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnTeam.setBounds(32, 575, 60, 31);
		contentPane.add(btnTeam);
		
		JLabel lblTname = new JLabel("2021\uB144 \uC5F0\uB9D0 \uC131\uACFC\uAE08 \uD611\uC758");
		lblTname.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		lblTname.setBounds(22, 10, 500, 68);
		contentPane.add(lblTname);
		
		JLabel lblHu = new JLabel("\uC778 \uC6D0");
		lblHu.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblHu.setBounds(22, 526, 82, 31);
		contentPane.add(lblHu);
		
		JLabel lblHu1 = new JLabel("\uBD80\uC7A5");
		lblHu1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu1.setBounds(126, 526, 53, 26);
		contentPane.add(lblHu1);
		
		JLabel lblHu2 = new JLabel("\uACFC\uC7A5");
		lblHu2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu2.setBounds(126, 576, 53, 26);
		contentPane.add(lblHu2);
		
		JLabel lblHu3 = new JLabel("\uC8FC\uC784");
		lblHu3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu3.setBounds(126, 624, 53, 26);
		contentPane.add(lblHu3);
		
		JLabel lblHu4 = new JLabel("\uC0AC\uC6D0");
		lblHu4.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblHu4.setBounds(126, 675, 53, 26);
		contentPane.add(lblHu4);
		
		JButton btnName = new JButton("\uAC15 \uC9C0 \uC6D0");
		btnName.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName.setBounds(181, 529, 95, 23);
		contentPane.add(btnName);
		
		JButton btnName_1 = new JButton("\uBC15 \uC900 \uC218");
		btnName_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName_1.setBounds(181, 579, 95, 23);
		contentPane.add(btnName_1);
		
		JButton btnName_2 = new JButton("\uACFD \uB300 \uC740");
		btnName_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName_2.setBounds(181, 627, 95, 23);
		contentPane.add(btnName_2);
		
		JButton btnName_3 = new JButton("\uC774 \uACBD \uBBFC");
		btnName_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnName_3.setBounds(181, 678, 95, 23);
		contentPane.add(btnName_3);
		
		JLabel lbEf = new JLabel("\uAE30\uB300\uD6A8\uACFC");
		lbEf.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbEf.setBounds(51, 88, 167, 47);
		contentPane.add(lbEf);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(51, 136, 786, 134);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(51, 343, 786, 162);
		contentPane.add(textField);
		
		JLabel lbEf_1 = new JLabel("\uC138\uBD80 \uB0B4\uC6A9");
		lbEf_1.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbEf_1.setBounds(51, 295, 167, 47);
		contentPane.add(lbEf_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uCD08\uC548 \uC791\uC131");
		chckbxNewCheckBox.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(376, 535, 186, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\uC138\uBD80 \uACC4\uD68D \uC124\uC815");
		chckbxNewCheckBox_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setSelected(true);
		chckbxNewCheckBox_1.setBounds(376, 580, 186, 22);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("\uC790\uB8CC \uC218\uC9D1");
		chckbxNewCheckBox_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1.setSelected(true);
		chckbxNewCheckBox_1_1.setBounds(376, 627, 186, 22);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("\uB9C8\uBB34\uB9AC");
		chckbxNewCheckBox_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1.setBounds(566, 708, 146, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("\uCD5C\uC885 \uAC80\uD1A0");
		chckbxNewCheckBox_1_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1_1.setBounds(566, 666, 146, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_2 = new JCheckBox("\uC911\uAC04 \uBCF4\uACE0");
		chckbxNewCheckBox_1_1_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1_2.setSelected(true);
		chckbxNewCheckBox_1_1_1_2.setBounds(376, 708, 186, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1_2_1 = new JCheckBox("\uC791\uB144 \uC5F0\uB9D0 \uC131\uACFC\uAE08 \uBE44\uAD50");
		chckbxNewCheckBox_1_1_1_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1_2_1.setSelected(true);
		chckbxNewCheckBox_1_1_1_2_1.setBounds(376, 666, 186, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_2_2 = new JCheckBox("\uC911\uAC04 \uBCF4\uACE0 \uC218\uC815");
		chckbxNewCheckBox_1_1_1_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1_2_2.setSelected(true);
		chckbxNewCheckBox_1_1_1_2_2.setBounds(566, 535, 146, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1_2_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1_2_2_1 = new JCheckBox("\uBCF4\uACE0\uC11C \uC791\uC131");
		chckbxNewCheckBox_1_1_1_2_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1_2_2_1.setSelected(true);
		chckbxNewCheckBox_1_1_1_2_2_1.setBounds(566, 580, 146, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1_2_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_2_2_1_1 = new JCheckBox("\uC138\uBD80 \uB0B4\uC6A9 \uC644\uC131");
		chckbxNewCheckBox_1_1_1_2_2_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1_2_2_1_1.setBounds(566, 627, 146, 22);
		contentPane.add(chckbxNewCheckBox_1_1_1_2_2_1_1);
		
		JButton btnNewButton = new JButton("\uC644  \uB8CC");
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnNewButton.setBounds(757, 667, 217, 63);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uAE30\uD55C");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel.setBounds(833, 525, 60, 36);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(359, 525, 386, 216);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("2021.11.01");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(762, 567, 115, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("~");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(861, 594, 32, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("2021.12.31");
		lblNewLabel_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(861, 623, 115, 27);
		contentPane.add(lblNewLabel_1_2);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectIng().setVisible(true);
				setVisible(false);
			}
		});
		
		btnSelect_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectEd().setVisible(true);
				setVisible(false);
			}
		});
		
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Team().setVisible(true);
			}
		});
	}
}
