import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;

public class Chart extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chart frame = new Chart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Chart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setBounds(896, 21, 52, 31);
		contentPane.add(btnHome);
		
		JButton btnHu = new JButton("\uC0AC\uC7A5 \uAE40\uC815\uBBFC");
		btnHu.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnHu.setBounds(403, 66, 159, 55);
		contentPane.add(btnHu);
		
		JLabel lblDno = new JLabel("\uC778\uC0AC\uBD80");
		lblDno.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblDno.setBounds(130, 234, 63, 36);
		contentPane.add(lblDno);
		
		JLabel lblTeam1 = new JLabel("1\uD300");
		lblTeam1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam1.setBounds(34, 330, 63, 36);
		contentPane.add(lblTeam1);
		
		JLabel lblTeam2 = new JLabel("2\uD300");
		lblTeam2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam2.setBounds(142, 330, 63, 36);
		contentPane.add(lblTeam2);
		
		JLabel lblTeam3 = new JLabel("3\uD300");
		lblTeam3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam3.setBounds(250, 330, 63, 36);
		contentPane.add(lblTeam3);
		
		JButton btnEmp1 = new JButton("\uBD80\uC7A5 \uAC15\uADDC\uD0DC");
		btnEmp1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1.setBounds(12, 399, 88, 31);
		contentPane.add(btnEmp1);
		
		JButton btnEmp2 = new JButton("\uACFC\uC7A5 \uAC15\uC131\uC8FC");
		btnEmp2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2.setBounds(12, 466, 88, 31);
		contentPane.add(btnEmp2);
		
		JButton btnEmp3 = new JButton("\uC8FC\uC784 \uACE0\uC120\uC601");
		btnEmp3.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3.setBounds(12, 536, 88, 31);
		contentPane.add(btnEmp3);
		
		JButton btnEmp4 = new JButton("\uC0AC\uC6D0 \uACFD\uC6A9\uC0C1");
		btnEmp4.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4.setBounds(12, 602, 88, 31);
		contentPane.add(btnEmp4);
		
		JButton btnEmp1_1 = new JButton("\uBD80\uC7A5 \uAD8C\uBBFC\uC815");
		btnEmp1_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_1.setBounds(117, 399, 88, 31);
		contentPane.add(btnEmp1_1);
		
		JButton btnEmp2_1 = new JButton("\uACFC\uC7A5 \uAE40\uB300\uC601");
		btnEmp2_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_1.setBounds(117, 466, 88, 31);
		contentPane.add(btnEmp2_1);
		
		JButton btnEmp3_1 = new JButton("\uC8FC\uC784 \uAE40\uB3C4\uC5F0");
		btnEmp3_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_1.setBounds(117, 536, 88, 31);
		contentPane.add(btnEmp3_1);
		
		JButton btnEmp4_1 = new JButton("\uC0AC\uC6D0 \uAE40\uB3D9\uD604");
		btnEmp4_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_1.setBounds(117, 602, 88, 31);
		contentPane.add(btnEmp4_1);
		
		JButton btnEmp1_2 = new JButton("\uBD80\uC7A5 \uAE40\uBBFC\uC9C0");
		btnEmp1_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_2.setBounds(225, 399, 88, 31);
		contentPane.add(btnEmp1_2);
		
		JButton btnEmp2_2 = new JButton("\uACFC\uC7A5 \uBB38\uC778\uADDC");
		btnEmp2_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_2.setBounds(225, 466, 88, 31);
		contentPane.add(btnEmp2_2);
		
		JButton btnEmp3_2 = new JButton("\uC8FC\uC784 \uB958\uC815\uC6D0");
		btnEmp3_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_2.setBounds(225, 536, 88, 31);
		contentPane.add(btnEmp3_2);
		
		JButton btnEmp4_2 = new JButton("\uC0AC\uC6D0 \uBC15\uAE30\uC131");
		btnEmp4_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_2.setBounds(225, 602, 88, 31);
		contentPane.add(btnEmp4_2);
		
		JLabel lblDno_1 = new JLabel("\uAE30\uD68D\uBD80");
		lblDno_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblDno_1.setBounds(460, 234, 63, 36);
		contentPane.add(lblDno_1);
		
		JLabel lblTeam1_1 = new JLabel("1\uD300");
		lblTeam1_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam1_1.setBounds(364, 330, 63, 36);
		contentPane.add(lblTeam1_1);
		
		JButton btnEmp1_3 = new JButton("\uBD80\uC7A5 \uBC15\uC120\uD615");
		btnEmp1_3.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_3.setBounds(342, 399, 88, 31);
		contentPane.add(btnEmp1_3);
		
		JButton btnEmp2_3 = new JButton("\uACFC\uC7A5 \uBC15\uD0DC\uD76C");
		btnEmp2_3.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_3.setBounds(342, 466, 88, 31);
		contentPane.add(btnEmp2_3);
		
		JButton btnEmp3_3 = new JButton("\uC8FC\uC784 \uC11C\uBBFC\uD615");
		btnEmp3_3.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_3.setBounds(342, 536, 88, 31);
		contentPane.add(btnEmp3_3);
		
		JButton btnEmp4_3 = new JButton("\uC0AC\uC6D0 \uAD8C\uC11D\uC900");
		btnEmp4_3.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_3.setBounds(342, 602, 88, 31);
		contentPane.add(btnEmp4_3);
		
		JButton btnEmp4_1_1 = new JButton("\uC0AC\uC6D0 \uC2E0\uC9C0\uC6D0");
		btnEmp4_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_1_1.setBounds(447, 602, 88, 31);
		contentPane.add(btnEmp4_1_1);
		
		JButton btnEmp3_1_1 = new JButton("\uC8FC\uC784 \uC774\uC131\uC724");
		btnEmp3_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_1_1.setBounds(447, 536, 88, 31);
		contentPane.add(btnEmp3_1_1);
		
		JButton btnEmp4_2_1 = new JButton("\uC0AC\uC6D0 \uAE40\uC9C0\uD604");
		btnEmp4_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_2_1.setBounds(555, 602, 88, 31);
		contentPane.add(btnEmp4_2_1);
		
		JButton btnEmp3_2_1 = new JButton("\uC8FC\uC784 \uC2EC\uC0C1\uC6C5");
		btnEmp3_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_2_1.setBounds(555, 536, 88, 31);
		contentPane.add(btnEmp3_2_1);
		
		JButton btnEmp2_2_1 = new JButton("\uACFC\uC7A5 \uC804\uD615\uC900");
		btnEmp2_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_2_1.setBounds(555, 466, 88, 31);
		contentPane.add(btnEmp2_2_1);
		
		JButton btnEmp2_1_1 = new JButton("\uACFC\uC7A5 \uC784\uC218\uACBD");
		btnEmp2_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_1_1.setBounds(447, 466, 88, 31);
		contentPane.add(btnEmp2_1_1);
		
		JButton btnEmp1_1_1 = new JButton("\uBD80\uC7A5 \uBC15\uC9C0\uC218");
		btnEmp1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_1_1.setBounds(447, 399, 88, 31);
		contentPane.add(btnEmp1_1_1);
		
		JButton btnEmp1_2_1 = new JButton("\uBD80\uC7A5 \uC548\uC131\uD658");
		btnEmp1_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_2_1.setBounds(555, 399, 88, 31);
		contentPane.add(btnEmp1_2_1);
		
		JLabel lblTeam2_1 = new JLabel("2\uD300");
		lblTeam2_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam2_1.setBounds(472, 330, 63, 36);
		contentPane.add(lblTeam2_1);
		
		JLabel lblTeam3_1 = new JLabel("3\uD300");
		lblTeam3_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam3_1.setBounds(580, 330, 63, 36);
		contentPane.add(lblTeam3_1);
		
		JLabel lblDno_2 = new JLabel("\uC7AC\uC815\uBD80");
		lblDno_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblDno_2.setBounds(791, 234, 63, 36);
		contentPane.add(lblDno_2);
		
		JLabel lblTeam1_2 = new JLabel("1\uD300");
		lblTeam1_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam1_2.setBounds(695, 330, 63, 36);
		contentPane.add(lblTeam1_2);
		
		JButton btnEmp1_4 = new JButton("\uBD80\uC7A5 \uAC15\uC9C0\uC6D0");
		btnEmp1_4.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_4.setBounds(673, 399, 88, 31);
		contentPane.add(btnEmp1_4);
		
		JButton btnEmp2_4 = new JButton("\uACFC\uC7A5 \uBC15\uC900\uC218");
		btnEmp2_4.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_4.setBounds(673, 466, 88, 31);
		contentPane.add(btnEmp2_4);
		
		JButton btnEmp3_4 = new JButton("\uC8FC\uC784 \uACFD\uB300\uC740");
		btnEmp3_4.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_4.setBounds(673, 536, 88, 31);
		contentPane.add(btnEmp3_4);
		
		JButton btnEmp4_4 = new JButton("\uC0AC\uC6D0 \uAE40\uACBD\uBBFC");
		btnEmp4_4.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_4.setBounds(673, 602, 88, 31);
		contentPane.add(btnEmp4_4);
		
		JButton btnEmp4_1_2 = new JButton("\uC0AC\uC6D0 \uBC31\uC131\uD658");
		btnEmp4_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_1_2.setBounds(778, 602, 88, 31);
		contentPane.add(btnEmp4_1_2);
		
		JButton btnEmp3_1_2 = new JButton("\uC8FC\uC784 \uAE40\uC0C1\uC724");
		btnEmp3_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_1_2.setBounds(778, 536, 88, 31);
		contentPane.add(btnEmp3_1_2);
		
		JButton btnEmp4_2_2 = new JButton("\uC0AC\uC6D0 \uD64D\uC9C4\uD604");
		btnEmp4_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp4_2_2.setBounds(886, 602, 88, 31);
		contentPane.add(btnEmp4_2_2);
		
		JButton btnEmp3_2_2 = new JButton("\uC8FC\uC784 \uC815\uC2DC\uC5F0");
		btnEmp3_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp3_2_2.setBounds(886, 536, 88, 31);
		contentPane.add(btnEmp3_2_2);
		
		JButton btnEmp2_2_2 = new JButton("\uACFC\uC7A5 \uAC15\uBBFC\uAE30");
		btnEmp2_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_2_2.setBounds(886, 466, 88, 31);
		contentPane.add(btnEmp2_2_2);
		
		JButton btnEmp2_1_2 = new JButton("\uACFC\uC7A5 \uC774\uC0C1\uC6B0");
		btnEmp2_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp2_1_2.setBounds(778, 466, 88, 31);
		contentPane.add(btnEmp2_1_2);
		
		JButton btnEmp1_1_2 = new JButton("\uBD80\uC7A5 \uAE40\uB3D9\uC6D0");
		btnEmp1_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_1_2.setBounds(778, 399, 88, 31);
		contentPane.add(btnEmp1_1_2);
		
		JButton btnEmp1_2_2 = new JButton("\uBD80\uC7A5 \uC815\uC885\uAD6C");
		btnEmp1_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnEmp1_2_2.setBounds(886, 399, 88, 31);
		contentPane.add(btnEmp1_2_2);
		
		JLabel lblTeam2_2 = new JLabel("2\uD300");
		lblTeam2_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam2_2.setBounds(803, 330, 63, 36);
		contentPane.add(lblTeam2_2);
		
		JLabel lblTeam3_2 = new JLabel("3\uD300");
		lblTeam3_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTeam3_2.setBounds(911, 330, 63, 36);
		contentPane.add(lblTeam3_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(485, 122, 1, 114);
		contentPane.add(verticalStrut);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 214, 330, 445);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(327, 214, 334, 445);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(658, 214, 328, 445);
		contentPane.add(scrollPane_2);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnEmp1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EmpCon2().setVisible(true);
			}
		});
	}
}
